package com.kh.mybatis.board.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.dao.TestBoardDao;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.Template;

public class TestBoardServiceImpl implements TestBoardService{
	
	private TestBoardDao TbDa = new TestBoardDao();

	@Override
	public ArrayList<Board> selectList() {
		SqlSession sqlSession = Template.getSqlSession();
		
		ArrayList<Board> list = TbDa.selectList(sqlSession);
		
		sqlSession.close();
		
		return list;
	}

}
