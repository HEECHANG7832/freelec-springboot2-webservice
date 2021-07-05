package com.jojoldu.book.springboot.service;

import com.jojoldu.book.springboot.domain.Tables.TablesRepository;
import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import com.jojoldu.book.springboot.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TablesService {
    private final TablesRepository tablesRepository;

    @Transactional(readOnly = true)
    public List<TablesListResponseDto> findAll() {
        return tablesRepository.findAll().stream()
                .map(TablesListResponseDto::new) //.map(tables -> new TablesListResponseDto(tables))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TablesListResponseDto> findTodaysTicker() {

        //Today
        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
        Calendar time = Calendar.getInstance();
        String Today = format1.format(time.getTime());

        return tablesRepository.findTodaysTicker(Today).stream()
                .map(TablesListResponseDto::new)
                .collect(Collectors.toList());
    }
}
