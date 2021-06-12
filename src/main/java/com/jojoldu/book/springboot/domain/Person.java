package com.jojoldu.book.springboot.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private Map<String, String> info = new HashMap<>();

    public void addInfo(String A, String B){
        this.info.put(A, B);
    }
    // Getter & Setter
}
