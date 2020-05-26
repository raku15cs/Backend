package com.example.demo.Medels;

public class CatalogItem {

	private String name;
	private String des;
	private int rating;
	
	
	public CatalogItem(String name, String des, int rating) {
		super();
		this.name = name;
		this.des = des;
		this.rating = rating;
	}
	public CatalogItem() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
