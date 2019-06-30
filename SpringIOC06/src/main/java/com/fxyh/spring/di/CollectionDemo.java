package com.fxyh.spring.di;

import java.io.Serializable;
import java.util.*;

public class CollectionDemo implements Serializable {
    private static final long serialVersionUID = -4477381744799533624L;

    private String[] arrayValue;
    private List<String> listValue;
    private Set<String> setValue;
    private Map<String, Object> mapValue;
    private Properties properties;

    public String[] getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    public List<String> getListValue() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    public Set<String> getSetValue() {
        return setValue;
    }

    public void setSetValue(Set<String> setValue) {
        this.setValue = setValue;
    }

    public Map<String, Object> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<String, Object> mapValue) {
        this.mapValue = mapValue;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionDemo{" +
                "arrayValue=" + Arrays.toString(arrayValue) +
                ", listValue=" + listValue +
                ", setValue=" + setValue +
                ", mapValue=" + mapValue +
                ", properties=" + properties +
                '}';
    }
}
