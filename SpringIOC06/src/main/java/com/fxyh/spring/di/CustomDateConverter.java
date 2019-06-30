package com.fxyh.spring.di;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

public class CustomDateConverter implements Converter<String, Date> {

    private String[] parsePatterns;

    public void setParsePatterns(String[] parsePatterns) {
        this.parsePatterns = parsePatterns;
    }

    @Override
    public Date convert(String source) {
        Date date = null;
        if (StringUtils.isBlank(source)){
            throw new IllegalArgumentException("");
        }
        try {
            date = DateUtils.parseDate(source, this.parsePatterns);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
