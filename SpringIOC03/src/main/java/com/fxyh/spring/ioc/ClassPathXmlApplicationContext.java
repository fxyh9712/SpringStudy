package com.fxyh.spring.ioc;

import com.fxyh.spring.util.Dom4jUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: ClassPathXmlApplicationContext
 * @description: BeanFactory的一个实现类
 * 1. 将xml中所有的bean标签创建出对象，然后放入容器中
 * 2. 对外提供了getBean方法，从而对于客户端而言可以很轻松的获取对象
 * @author: fengzhaoquan
 * @create: 2019-06-16 16:44
 * @Version 1.0
 **/
public class ClassPathXmlApplicationContext implements BeanFactory {

    /**
     * @Author fengzhaoquan
     * @Description 配置文件中所有的bean都会放入beanMap中
     **/
    private static Map<String, Object> beanMap = Collections.synchronizedMap(new HashMap<>());

    public ClassPathXmlApplicationContext() {
        this("applicationContext.xml");
    }

    public ClassPathXmlApplicationContext(String fileName) {
        if (StringUtils.isBlank(fileName)) {
            throw new IllegalArgumentException("");
        }
        try {
            // 解析XML
            // 初始化beanMap
            initBeanMap(fileName);
            // 将bean之间的关系装配好(注入)
            injection(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author fengzhaoquan
     * @Description 将bean之间的关系装配好（注入）
     **/
    private void injection(String fileName) throws Exception {
        Document document = Dom4jUtils.getDocument(fileName);
        List<Element> propertyElementList = document.selectNodes("//beans/bean/property");

        if (CollectionUtils.isNotEmpty(propertyElementList)) {
            for (Element propertyElement : propertyElementList) {
                String name = propertyElement.attributeValue("name");
                String refValue = propertyElement.attributeValue("ref");

                //setXxx方法拼接
                String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);

                //找到父元素，也是就要被注入的对象
                Element beanElement = propertyElement.getParent();
                String parentElementIdValue = beanElement.attributeValue("id");
                if (beanMap.containsKey(parentElementIdValue) && beanMap.containsKey(refValue)){
                    Object targetObject = beanMap.get(parentElementIdValue);
                    Object parameterValue = beanMap.get(refValue);
                    Method method = targetObject.getClass().getDeclaredMethod(methodName, parameterValue.getClass().getInterfaces());
                    method.invoke(targetObject, parameterValue);
                }
            }
        }

    }

    /**
     * @Author fengzhaoquan
     * @Description 初始化beanMap
     **/
    private void initBeanMap(String fileName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Document document = Dom4jUtils.getDocument(fileName);
        //XPath
        List<Element> beanElementList = document.selectNodes("//beans/bean");
        if (CollectionUtils.isNotEmpty(beanElementList)) {
            for (Element beanElement : beanElementList) {
                String id = beanElement.attributeValue("id");
                String beanClassName = beanElement.attributeValue("class");
                beanMap.put(id, Class.forName(beanClassName).newInstance());
            }
        }
    }


    @Override
    public Object getBean(Class clazz) {
        if(clazz == null){
            throw new IllegalArgumentException("");
        }
        return beanMap.get(clazz.getSimpleName().substring(0,1).toLowerCase() + clazz.getSimpleName().substring(1));
    }

    @Override
    public Object getBean(String className) {
        if(StringUtils.isBlank(className)){
            throw new IllegalArgumentException("");
        }
        return beanMap.get(className);
    }
}
