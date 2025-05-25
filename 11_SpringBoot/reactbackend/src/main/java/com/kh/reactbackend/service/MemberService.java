package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.MemberDto;

import java.util.Optional;

public interface MemberService {
    String createMember(MemberDto.Create createDto);

    boolean existsByUserId(String userId);

    Optional<MemberDto.Response> login(String userId, String userPwd);

    MemberDto.Response findMember(String userId);

    MemberDto.Response updateMember(String userId, MemberDto.Update updateDto);
}
