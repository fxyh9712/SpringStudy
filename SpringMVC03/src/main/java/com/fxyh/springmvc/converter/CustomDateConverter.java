package com.fxyh.springmvc.converter;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

public class CustomDateConverter implements Converter<String, Date> {

    String[] patterns;

    public void setPatterns(String[] patterns) {
        this.patterns = patterns;
    }

    @Override
    public Date convert(String source) {
        Date date = null;
        if (StringUtils.isBlank(source)) {
            throw new IllegalArgumentException("");
        }
        try {
            date = DateUtils.parseDate(source, patterns);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
