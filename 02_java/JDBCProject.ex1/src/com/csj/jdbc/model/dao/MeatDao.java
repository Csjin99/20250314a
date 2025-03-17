package com.csj.jdbc.model.dao;

import static com.csj.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.csj.jdbc.model.vo.Meat;


public class MeatDao {
	
	public int insertMeat(Meat m, Connection conn) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO BUYMEAT VALUES(?,?,?,SYSDATE)";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getMeatName());
			pstmt.setInt(2, m.getBuyPrice());
			pstmt.setInt(3, m.getBuyNum());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateMeatPrice(Meat m, Connection conn) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEAT SET PRICE = ? WHERE MEATNAME =?";
						
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, m.getPrice());
			pstmt.setString(2, m.getMeatName());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public ArrayList<Meat> selectMeat(Connection conn){
		ResultSet rset = null;
		ArrayList<Meat> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		
		String sql = "SELECT * FROM MEAT";
				
		try {
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Meat m = new Meat();
				m.setMeatNmae(rset.getString("MEATNAME"));
				m.setPrice(rset.getInt("PRICE"));
				m.setBuyNum(rset.getInt("BUYNUM"));
				m.setSalesNum(rset.getInt("SALESNUM"));
				
				list.add(m);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	public int deleteMeat(String name, Connection conn) {
		
		int res = 0;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEAT WHERE MEATNAME = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return res;
	}
	
	public int buyMeat(Meat m, Connection conn) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEAT SET SALESNUM = ? WHERE MEATNAME =?";
						
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, m.getSalesNum());
			pstmt.setString(2, m.getMeatName());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
	}
	

}
