package com.csj.jdbc.model.vo;

public class Meat {
	private String MeatName;
	private int Price;
	private int BuyPrice;
	private int BuyNum;
	private int SalesNum;

	
	public Meat() {
		super();
	}

	public Meat(String meatName, int price, int buyPrice, int buyNum, int salesNum) {
		super();
		MeatName = meatName;
		Price = price;
		BuyPrice = buyPrice;
		BuyNum = buyNum;
		SalesNum = salesNum;

	}

	public Meat(String meatName, int price) {
		super();
		MeatName = meatName;
		Price = price;
	}
	
	public Meat(String meatName, int buyPrice, int buyNum) {
		super();
		MeatName = meatName;
		BuyPrice = buyPrice;
		BuyNum = buyNum;
	}

	public String getMeatName() {
		return MeatName;
	}

	public void setMeatNmae(String meatName) {
		MeatName = meatName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getBuyPrice() {
		return BuyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		BuyPrice = buyPrice;
	}

	public int getBuyNum() {
		return BuyNum;
	}

	public void setBuyNum(int buyNum) {
		BuyNum = buyNum;
	}

	public int getSalesNum() {
		return SalesNum;
	}

	public void setSalesNum(int salesNum) {
		SalesNum = salesNum;
	}

	@Override
	public String toString() {
		return MeatName +", 남은수량: "+ BuyNum +", 가격 : "+ Price + ", 판매수 : "+ SalesNum;
	}
	
	
	
	
	

}
