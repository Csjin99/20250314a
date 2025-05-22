package com.kh.jpa.controller;

import com.kh.jpa.dto.MemberDto;
import com.kh.jpa.dto.NoticeDto;
import com.kh.jpa.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notices")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    // 공지사항 등록
    @PostMapping
    public ResponseEntity<Long> addNotice(@RequestBody NoticeDto.Create createDto) {
        Long noticeNo = noticeService.createNotice(createDto);
        return ResponseEntity.ok(noticeNo);
    }

    // 공지사항 단건 조회
    @GetMapping("/{noticeNo}")
    public ResponseEntity<NoticeDto.Response> getNotice(@PathVariable Long noticeNo) {
        return ResponseEntity.ok(noticeService.findNotice(noticeNo));
    }

    // 공지사항 전체 목록 조회
    @GetMapping
    public ResponseEntity<List<NoticeDto.Response>> getAllNotices() {
        return ResponseEntity.ok(noticeService.findAllNotices());
    }

    // 공지사항 수정
    @PutMapping("/{noticeNo}")
    public ResponseEntity<NoticeDto.Response> updateNotice(
            @PathVariable Long noticeNo,
            @RequestBody NoticeDto.Update updateDto) {
        return ResponseEntity.ok(noticeService.updateNotice(noticeNo, updateDto));
    }

    // 공지사항 삭제
    @DeleteMapping("/{noticeNo}")
    public ResponseEntity<Void> deleteNotice(@PathVariable Long noticeNo) {
        noticeService.deleteNotice(noticeNo);
        return ResponseEntity.ok().build();
    }

    //키워드로 검색
    @GetMapping("/serch/title")
    public ResponseEntity<List<NoticeDto.Response>> serchNoticeByTitle(@RequestParam String title) {
        return ResponseEntity.ok(noticeService.findByTitle(title));
    }
}