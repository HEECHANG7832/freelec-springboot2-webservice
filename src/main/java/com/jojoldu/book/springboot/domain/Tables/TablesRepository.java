package com.jojoldu.book.springboot.domain.Tables;

import com.jojoldu.book.springboot.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TablesRepository extends JpaRepository<Tables, Long> {

    @Query("SELECT t FROM Tables t WHERE t.DateString = ?1")
    List<Tables> findTodaysTicker(String Date);

}
