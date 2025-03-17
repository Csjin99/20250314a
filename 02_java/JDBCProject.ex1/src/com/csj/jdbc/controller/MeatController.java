package com.csj.jdbc.controller;

import java.util.ArrayList;

import com.csj.jdbc.model.vo.Meat;
import com.csj.jdbc.service.MeatService;
import com.csj.jdbc.view.MeatMenu;

public class MeatController {
	private MeatService ms = new MeatService();
	
	public void insertMeat(String name, int buyprice, int buynum) {
		Meat m = new Meat(name,buyprice,buynum);
		
		int res = ms.insertMeat(m);
		
		if(res > 0) {
			new MeatMenu().displaySuccess("고기 매입 성공");
		} else {
			new MeatMenu().displayFail("고기 매입 실패");
		}
		
	}
	
	public void updateMeatPrice(String meatName,int price) {
		Meat m = new Meat();
		m.setMeatNmae(meatName);
		m.setPrice(price);
		
		int res = ms.updateMeatPrice(m);
		
		if(res > 0) {
			new MeatMenu().displaySuccess("가격 추가 및 조정 성공");
		} else {
			new MeatMenu().displayFail("가격추가 및 조정 실패");
		}
	}
	
	public void selectMeat() {
		ArrayList<Meat> list = ms.selectMeat();
		if(list.isEmpty()) {
		} else {
			new MeatMenu().displayMemberList(list);
		}
	}
	
	
	public void deleteMeat(String name) {
		int res = ms.deleteMeat(name);
		
		if(res > 0) {
			new MeatMenu().displaySuccess("메뉴판에서 삭제하였습니다.");
		} else {
			new MeatMenu().displayFail("메뉴판에서 삭제 실패");
		}
		
	}
	
	public void buyMeat(String name, int salsenum) {
		Meat m = new Meat();
		m.setMeatNmae(name);
		m.setSalesNum(salsenum);
		
		int res = ms.buyMeat(m);
		
		if(res > 0) {
			new MeatMenu().displaySuccess("구매 성공");
		} else {
			new MeatMenu().displayFail("구매 실패");
		}
	}

}
