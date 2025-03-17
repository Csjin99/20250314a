package com.kh.mybatis.member.service;

import com.kh.mybatis.member.model.vo.Member;

//함수이름을 정의해주는 클래스
public interface MemberService {
	Member loginMember(Member m);
	int insertMember(Member m);
	
}
