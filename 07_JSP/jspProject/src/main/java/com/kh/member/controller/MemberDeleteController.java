package com.kh.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

/**
 * Servlet implementation class MemberDeleteController
 */
@WebServlet("/delete.me")
public class MemberDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userPwd = request.getParameter("userPwd");
		
		HttpSession session = request.getSession();
		Member loginUser = (Member)session.getAttribute("loginUser");
		
		if(loginUser == null || !loginUser.getUserPwd().equals(userPwd)) { // 로그인이 안됐거나 현재로그인값과 입력한패스워드값이 다른경우
			request.setAttribute("errorMsg", "잘못된 접근입니다.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response); // 정상적인 접근이 아닌경우  에러페이지가 보이게 표시
			return;
		}
		
		int result = new MemberService().deleteMember(loginUser.getUserId());
		
		if(result ==0) {
			request.setAttribute("errorMsg", "회원 탈퇴에 실패하였습니다..");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response); // 정상적인 접근이 아닌경우  에러페이지가 보이게 표시
		} else{
			session.removeAttribute("loginUser");
			session.setAttribute("alertMsg", "회원탈퇴가 정상적으로 처리되었습니다.");
			response.sendRedirect(request.getContextPath());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
