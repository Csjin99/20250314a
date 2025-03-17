package com.csj.jdbc.model.vo;

public class GUEST {
	private int table;
	private String name;
	private int price;
	private int salsenum;

	public static void main(String[] args) {
		


	}

	public GUEST() {
		super();
	}

	public GUEST(int table, String name, int salsenum) {
		super();
		this.table = table;
		this.name = name;
		this.salsenum = salsenum;
	}

	public int getTable() {
		return table;
	}

	public void setTable(int table) {
		this.table = table;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getsalsenum() {
		return salsenum;
	}

	public void setsalsenum(int salsenum) {
		this.salsenum = salsenum;
	}

	@Override
	public String toString() {
		return "GUEST [table=" + table + ", name=" + name + ", price=" + price + ", salsenum=" + salsenum + "]";
	}
	
	

}
