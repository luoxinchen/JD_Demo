package com.demo.pojo;
/**
 *此类是货物信息类
 */
public class HuoWu {
	private int id;
	private String name;
	private int number;
	private float price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "HuoWu [id=" + id + ", name=" + name + ", number=" + number + ", price=" + price + "]";
	}
}
