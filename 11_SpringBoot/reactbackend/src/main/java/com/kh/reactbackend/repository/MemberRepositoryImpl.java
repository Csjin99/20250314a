package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class MemberRepositoryImpl implements MemberRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Member member) {
        em.persist(member);
    }

    @Override
    public boolean existsByUserId(String userId) {
        String jpql = "SELECT COUNT(m) FROM Member m WHERE m.userId = :userId";
        Long count = em.createQuery(jpql, Long.class)
                .setParameter("userId", userId)
                .getSingleResult();
        return count > 0;
    }

    @Override
    public Optional<Member> findByUserIdAndUserPwd(String userId, String userPwd) {
        String jpql = "SELECT m FROM Member m WHERE m.userId = :userId AND m.userPwd = :userPwd";
        List<Member> result = em.createQuery(jpql, Member.class)
                .setParameter("userId", userId)
                .setParameter("userPwd", userPwd)
                .getResultList();
        if (result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result.get(0));
        }
    }

    public Optional<Member> findOne(String userId) {
        return Optional.ofNullable(em.find(Member.class, userId));
    }


}
