package com.kimschool.manage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class jpa_test {

	@Id
	private int no;
	private String name;
	private int age;
	private String address;
	private String likefood;
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the likefood
	 */
	public String getLikefood() {
		return likefood;
	}
	/**
	 * @param likefood the likefood to set
	 */
	public void setLikefood(String likefood) {
		this.likefood = likefood;
	}
	@Override
	public String toString() {
		return "jpa_test [no=" + no + ", name=" + name + ", age=" + age + ", address=" + address + ", likefood="
				+ likefood + "]";
	}
	
	
}
