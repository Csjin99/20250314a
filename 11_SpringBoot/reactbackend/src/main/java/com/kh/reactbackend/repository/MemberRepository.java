package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Member;

import java.util.Optional;

public interface MemberRepository {
    void save(Member member);

    boolean existsByUserId(String userId);

    Optional<Member> findByUserIdAndUserPwd(String userId, String userPwd);

    Optional<Member> findOne(String userId);
}
