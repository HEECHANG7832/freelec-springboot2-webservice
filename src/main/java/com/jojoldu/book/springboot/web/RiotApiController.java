package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.domain.Response;
import com.jojoldu.book.springboot.service.RestTemplateService;
import com.jojoldu.book.springboot.service.TablesService;
import com.jojoldu.book.springboot.web.dto.SummonerDto;
import com.jojoldu.book.springboot.web.dto.TablesListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RiotApiController {

    private final RestTemplateService restTemplateService;

//    @GetMapping("/api/v1/riot/person")
//    public Response findAll() {
//        return restTemplateService.callPostExternalServer();
//    }

    @GetMapping("/api/v1/riot/summoner")
    public SummonerDto getSummoner() {
        return restTemplateService.callPostExternalServer();
    }
}
