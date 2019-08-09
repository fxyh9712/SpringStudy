package com.fxyh.springmvc.vo;

import java.io.Serializable;
import java.util.List;

public class CollectionVO implements Serializable {


    private static final long serialVersionUID = -7912633966781257553L;
    List<String> collection;

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }
}
