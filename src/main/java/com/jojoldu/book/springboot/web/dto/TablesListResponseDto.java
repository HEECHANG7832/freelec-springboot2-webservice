package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.Tables.Tables;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class TablesListResponseDto {

    private Long id;
    private String DateString;
    private String Ticker;
    private double TargetPrice;
    private double Ma5;
    private double CurrentPrice;

    public TablesListResponseDto(Tables entity) {
        this.id = entity.getId();
        this.DateString = entity.getDateString();
        this.Ticker = entity.getTicker();
        this.TargetPrice = entity.getTargetPrice();
        this.Ma5 = entity.getMa5();
        this.CurrentPrice = entity.getCurrentPrice();
    }
}
