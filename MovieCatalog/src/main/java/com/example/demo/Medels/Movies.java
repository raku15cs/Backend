package com.example.demo.Medels;

public class Movies {
	
	private String movieid;
	private String name;
	private String desc;
	
	
	public Movies(String movieid, String name, String desc) {
		super();
		this.movieid = movieid;
		this.name = name;
		this.desc = desc;
	}
	
	public Movies() {
		super();
	}
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
