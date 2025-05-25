package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.MemberDto;
import com.kh.reactbackend.entity.Member;
import com.kh.reactbackend.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public String createMember(MemberDto.Create createDto) {
        Member member = createDto.toEntity();
        memberRepository.save(member);
        return member.getUserId();
    }

    @Override
    public boolean existsByUserId(String userId) {
        return memberRepository.existsByUserId(userId);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<MemberDto.Response> login(String userId, String userPwd) {
        return memberRepository.findByUserIdAndUserPwd(userId, userPwd)
                .map(MemberDto.Response::toDto);
    }

    @Transactional(readOnly = true)
    @Override
    public MemberDto.Response findMember(String userId) {
        return memberRepository.findOne(userId)
                .map(MemberDto.Response::toDto) //있으면 변환해줘.
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));
    }

    @Override
    public MemberDto.Response updateMember(String userId, MemberDto.Update updateDto) {
        Member member = memberRepository.findOne(userId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));
        member.upadteMemberInfo(
                updateDto.getUser_id(),
                updateDto.getUser_pwd(),
                updateDto.getUser_name(),
                updateDto.getEmail(),
                updateDto.getGender(),
                updateDto.getAge()
        );
        return MemberDto.Response.toDto(member);
    }

}
