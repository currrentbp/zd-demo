package com.bp.entity;


/**
 * 
 * @author current_bp
 * @createTime 20161205
 *
 */
public class Student {
	
	private Long id;
	private String name;
	private String address;
	private Integer num;
	
	public Student(){};
	public Student(Long id,String name){
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	

}
