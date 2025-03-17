package com.kh.jdbc.controller;

import java.util.ArrayList;

import com.kh.jdbc.model.dao.MemberDao;
import com.kh.jdbc.model.vo.Member;
import com.kh.jdbc.service.MemberService;
import com.kh.jdbc.view.MemberMenu;

/*
 * Controller : View를 통해서 사용자가 요청한 기능에 대해 처리하는 객체
 * 				해당 메서드로 전달된 데이터[가공처리후] Dao로 전달하여 호출
 * 				Dao로부터 반환 받은 결과에 따라서 성공/실패 여부를 판단하여 응답하면 결정-> View메서드 호출
 */

public class MemberController {
	private MemberService ms = new MemberService();
	
	/**
	 * 사용자의 추가요청을 처리하는 메서드
	 * userId~hobby : 사용자가 입력한 정보들을 매게변수로 받음
	 */
	
	public void insertMember(String userId, String userPwd, String userName, String gender,
							String age, String email, String phone, String address, String hobby) {
		//view로부터 전달받은 값을 바로 dao쪽으로 전달x
		//vo객체에 담아서 service로 전달
		
		Member m = new Member(userId,userPwd,userName,gender,
							Integer.parseInt(age),email,phone,address,hobby);
		
		int result =ms.insertMemer(m);
		if(result > 0) {
			new MemberMenu().displaySuccess("회원 추가 성공");
		} else {
			new MemberMenu().displayFail("회원추가 실패");
		}
		
		
	}
	public void selectList() {
		ArrayList<Member> list = ms.selectList();
		
		if(list.isEmpty()) {
			new MemberMenu().displayNoData("전체 조회결과가 없습니다.");
		} else {
			new MemberMenu().displayMemberList(list);
		}
		
	}
	
	/**
	 * ID를 통해서 회원을 삭제하는 메서드
	 */
	
	public void deleteMember(String userId) {
		int result = ms.deleteMember(userId);
		
		if(result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원 정보를 삭제하였습니다.");
		} else {
			new MemberMenu().displayFail("회원정보를 삭제하는데 실패하였습니다.");
		}
		
	}
	
	/**
	 * userId,email,phone,address,hobby 를 전달받아
	 * Member를 수정하는 메서드
	 */
	public void updateMember(String userId, String email, String phone, String address, String hobby) {
		Member m = new Member();
		m.setUserId(userId);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
		m.setHobby(hobby);
		
		int res = ms.updateMember(m);
		
		if(res > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원 정보를 수정하였습니다.");
		} else {
			new MemberMenu().displayFail("회원정보를 수정하는데 실패하였습니다.");
		}

	}
	/**
	 * 이름으로 키워드 검색
	 * ketword : 사용자가 입력한 검색 키워드
	 */
	public void selectByUserName(String keyword) {
		ArrayList<Member> list = ms.seletByUserName(keyword);
		
		if(list.isEmpty()) {
			new MemberMenu().displayNoData(keyword + "에 해당하는 검색 결과가 없습니다.");
		} else{
			new MemberMenu().displayMemberList(list);
		}
		
	}
	
}
