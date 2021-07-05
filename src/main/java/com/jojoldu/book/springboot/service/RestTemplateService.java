package com.jojoldu.book.springboot.service;

import com.jojoldu.book.springboot.domain.Person;
import com.jojoldu.book.springboot.domain.Response;
import com.jojoldu.book.springboot.web.dto.SummonerDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;


@Service
public class RestTemplateService {

    //private ApiService<Response> apiService;
    private ApiService<SummonerDto> apiService;

    @Autowired
    public RestTemplateService(ApiService<SummonerDto> apiService) {
        this.apiService = apiService;
    }

//    public Response callPostExternalServer() {
//        Person person = new Person();
//        person.setName("jake");
//        person.setAge(10);
//        person.addInfo("gender", "male");
//
//        return apiService.post("https://postman-echo.com/post", HttpHeaders.EMPTY, person, Response.class).getBody();
//    }

    public SummonerDto callPostExternalServer() {
        SummonerDto summonerDto = new SummonerDto();

        return apiService.get("https://kr.api.riotgames.com/tft/summoner/v1/summoners/by-name/hide on bush?api_key=", HttpHeaders.EMPTY, SummonerDto.class).getBody();
    }
}

