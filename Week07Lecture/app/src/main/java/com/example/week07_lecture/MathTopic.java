package com.example.week07_lecture;

import java.io.Serializable;

public class MathTopic implements Serializable {
    public static String EXTRA_MATHTOPIC = "com.example.week07_lecture.EXTRA_MATHTOPIC";

    private String name;
    private String url;

    public MathTopic(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
