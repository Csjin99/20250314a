package com.csj.jdbc.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import static com.csj.common.JDBCTemplate.*;


import com.csj.jdbc.model.dao.MeatDao;
import com.csj.jdbc.model.vo.Meat;


public class MeatService {
	private MeatDao md = new MeatDao();
	
	public int insertMeat(Meat m) {
		Connection conn = getConnection();
		int result = md.insertMeat(m, conn);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateMeatPrice(Meat m) {
		Connection conn = getConnection();
		int result = md.updateMeatPrice(m, conn);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public ArrayList<Meat> selectMeat(){
		Connection conn = getConnection();
		ArrayList<Meat> list = md.selectMeat(conn);
		
		close(conn);
		return list;
	}
	
	public int deleteMeat(String name) {
		Connection conn = getConnection();
		int result = md.deleteMeat(name, conn);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
		
	}
	
	public int buyMeat(Meat m) {
		Connection conn = getConnection();
		int result = md.buyMeat(m, conn);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
		
	}
	
	
}
