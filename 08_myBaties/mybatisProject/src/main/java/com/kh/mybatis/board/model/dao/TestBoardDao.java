package com.kh.mybatis.board.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.vo.Board;

public class TestBoardDao {
	
	public ArrayList<Board> selectList(SqlSession sqlSession){
		
		
		return (ArrayList)sqlSession.selectList("BoardMapper.tboardselect");
		

	}
}
