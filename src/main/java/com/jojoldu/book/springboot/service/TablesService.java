package com.jojoldu.book.springboot.service;

import com.jojoldu.book.springboot.domain.Tables.TablesRepository;
import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import com.jojoldu.book.springboot.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
