package com.kh.jpa.service;

import com.kh.jpa.dto.MemberDto;
import com.kh.jpa.dto.NoticeDto;

import java.util.List;

public interface NoticeService {

    // 공지사항 등록
    Long createNotice(NoticeDto.Create createDto);

    // 공지사항 단건 조회
    NoticeDto.Response findNotice(Long noticeNo);

    // 공지사항 전체 조회
    List<NoticeDto.Response> findAllNotices();

    // 공지사항 수정
    NoticeDto.Response updateNotice(Long noticeNo, NoticeDto.Update updateDto);

    // 공지사항 삭제
    void deleteNotice(Long noticeNo);

    //키워드로 검색
    List<NoticeDto.Response> findByTitle(String title);
}