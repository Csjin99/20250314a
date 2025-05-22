package com.kh.jpa.repository;

import com.kh.jpa.entity.Member;
import com.kh.jpa.entity.Notice;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NoticeRepositoryImpl implements NoticeRepository {

    @PersistenceContext
    private EntityManager em;

    // 저장
    @Override
    public Notice save(Notice notice) {
        if (notice.getNoticeNo() == null) {
            em.persist(notice);
            return notice;
        } else {
            return em.merge(notice);
        }
    }

    // 단건 조회
    @Override
    public Optional<Notice> findOne(Long noticeNo) {
        return Optional.ofNullable(em.find(Notice.class, noticeNo));
    }

    // 전체 조회
    @Override
    public List<Notice> findAll() {
        return em.createQuery("SELECT n FROM Notice n", Notice.class)
                .getResultList();
    }

    // 삭제
    @Override
    public void delete(Notice notice) {
        em.remove(em.contains(notice) ? notice : em.merge(notice));
    }

    //키워드로 검색
    @Override
    public List<Notice> findByTitle(String title) {
        String query = "select n from Notice n where n.noticeTitle LIKE :titlename"; //%지원%
        return em.createQuery(query, Notice.class)
                .setParameter("titlename", "%"+title+"%")
                .getResultList();
    }
}