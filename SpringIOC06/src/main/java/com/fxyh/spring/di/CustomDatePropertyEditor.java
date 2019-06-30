package com.fxyh.spring.di;

import org.apache.commons.lang3.time.DateUtils;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.util.Date;

public class CustomDatePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Date date = null;
        try {
            date = DateUtils.parseDate(text, "yyyy-MM-dd");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.setValue(date);
    }
}
