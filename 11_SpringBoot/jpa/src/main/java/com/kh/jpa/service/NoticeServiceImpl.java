package com.kh.jpa.service;

import com.kh.jpa.dto.MemberDto;
import com.kh.jpa.dto.NoticeDto;
import com.kh.jpa.entity.Member;
import com.kh.jpa.entity.Notice;
import com.kh.jpa.repository.MemberRepository;
import com.kh.jpa.repository.NoticeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class NoticeServiceImpl implements NoticeService {

    private final NoticeRepository noticeRepository;
    private final MemberRepository memberRepository;

    // 공지사항 등록
    @Override
    public Long createNotice(NoticeDto.Create createDto) {
        Member member = memberRepository.findOne(createDto.getWriter_id())
                .orElseThrow(() -> new EntityNotFoundException("작성자(Member) 없음: " + createDto.getWriter_id()));
        Notice notice = createDto.toEntity(member);
        return noticeRepository.save(notice).getNoticeNo();
    }

    // 공지사항 단건 조회
    @Override
    @Transactional(readOnly = true)
    public NoticeDto.Response findNotice(Long noticeNo) {
        Notice notice = noticeRepository.findOne(noticeNo)
                .orElseThrow(() -> new EntityNotFoundException("공지사항 없음: " + noticeNo));
        return NoticeDto.Response.toDto(notice);
    }

    // 공지사항 전체 목록 조회
    @Override
    @Transactional(readOnly = true)
    public List<NoticeDto.Response> findAllNotices() {
        return noticeRepository.findAll().stream()
                .map(NoticeDto.Response::toDto)
                .collect(Collectors.toList());
    }

    // 공지사항 수정
    @Override
    public NoticeDto.Response updateNotice(Long noticeNo, NoticeDto.Update updateDto) {
        Notice notice = noticeRepository.findOne(noticeNo)
                .orElseThrow(() -> new EntityNotFoundException("공지사항 없음: " + noticeNo));
        notice.updateNotice(updateDto.getNotice_title(), updateDto.getNotice_content());
        return NoticeDto.Response.toDto(notice);
    }

    // 공지사항 삭제
    @Override
    public void deleteNotice(Long noticeNo) {
        Notice notice = noticeRepository.findOne(noticeNo)
                .orElseThrow(() -> new EntityNotFoundException("공지사항 없음: " + noticeNo));
        noticeRepository.delete(notice);
    }

    //제목키워드로 검색
    @Override
    public List<NoticeDto.Response> findByTitle(String title){
        return noticeRepository.findByTitle(title).stream()
                .map(NoticeDto.Response::toDto)
                .collect(Collectors.toList());
    }
}