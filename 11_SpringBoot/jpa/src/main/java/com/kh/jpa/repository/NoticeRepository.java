package com.kh.jpa.repository;

import com.kh.jpa.entity.Member;
import com.kh.jpa.entity.Notice;

import java.util.List;
import java.util.Optional;

public interface NoticeRepository {

    Notice save(Notice notice); // 공지 저장

    Optional<Notice> findOne(Long noticeNo); // 단건 조회

    List<Notice> findAll(); // 전체 조회

    void delete(Notice notice); // 삭제

    List<Notice> findByTitle(String title);
}