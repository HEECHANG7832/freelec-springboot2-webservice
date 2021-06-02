package com.jojoldu.book.springboot.domain.tables;

import com.jojoldu.book.springboot.domain.Tables.Tables;
import com.jojoldu.book.springboot.domain.Tables.TablesRepository;
import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TablesRepositoryTest {

    @Autowired
    TablesRepository tablesRepository;

    @After
    public void cleanup() {
        tablesRepository.deleteAll();
    }

    @Test
    public void 테이블_불러오기() {
        //given
        String DateString = "2020-01-02";
        String Ticker = "ETH_TEST";

        tablesRepository.save(Tables.builder()
                .DateString(DateString)
                .Ticker(Ticker)
                .TargetPrice(123.123)
                .Ma5(123.123)
                .CurrentPrice(123.123)
                .build());

        //when
        List<Tables> TablesList = tablesRepository.findAll();

        for(Tables table : TablesList){
            System.out.println(table.getCurrentPrice());
        }

        //then
        Tables tables = TablesList.get(0);
        System.out.println(tables.getDateString());
        assertThat(tables.getDateString()).isEqualTo(DateString);
        assertThat(tables.getTicker()).isEqualTo(Ticker);
    }
}
