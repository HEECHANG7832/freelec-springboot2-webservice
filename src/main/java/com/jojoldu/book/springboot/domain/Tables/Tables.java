package com.jojoldu.book.springboot.domain.Tables;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity  //JPA가 관리하는 클래스
public class Tables{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String DateString;

    @Column
    private String Ticker;

    @Column
    private double TargetPrice;

    @Column
    private double Ma5;

    @Column
    private double CurrentPrice;

    @Builder
    public Tables(String DateString, String Ticker, double TargetPrice, double Ma5, double CurrentPrice) {
        this.DateString = DateString;
        this.Ticker = Ticker;
        this.TargetPrice = TargetPrice;
        this.Ma5 = Ma5;
        this.CurrentPrice = CurrentPrice;
    }

//    public void update(String DateString, String ticker, String target_price, String ma5, String current_price) {
//        this.DateString = DateString;
//        this.ticker = ticker;
//        this.target_price = target_price;
//        this.ma5 = ma5;
//        this.current_price = current_price;
//    }
}
