package com.jojoldu.book.springboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jojoldu.book.springboot.web.dto.SummonerDto;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Person data;
    private Map<String, String> headers;

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }
}

