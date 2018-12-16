package com.personDomain;

public class StrudentDomain {
	private String id ;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getStrObject(){
		System.out.println("本地修改的文件");
	}
	
	
}
