package com.kimschool.manage.entity;

import java.util.List;

public class WbsInfoVo {

	private String u_name;
	private String u_no;
	
	private String min_time;
	private String max_time;
	
	List<Wbs> wbslist;

	/**
	 * @return the u_name
	 */
	public String getU_name() {
		return u_name;
	}

	/**
	 * @param u_name the u_name to set
	 */
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	/**
	 * @return the u_no
	 */
	public String getU_no() {
		return u_no;
	}

	/**
	 * @param u_no the u_no to set
	 */
	public void setU_no(String u_no) {
		this.u_no = u_no;
	}

	/**
	 * @return the min_time
	 */
	public String getMin_time() {
		return min_time;
	}

	/**
	 * @param min_time the min_time to set
	 */
	public void setMin_time(String min_time) {
		this.min_time = min_time;
	}

	/**
	 * @return the max_time
	 */
	public String getMax_time() {
		return max_time;
	}

	/**
	 * @param max_time the max_time to set
	 */
	public void setMax_time(String max_time) {
		this.max_time = max_time;
	}

	/**
	 * @return the wbslist
	 */
	public List<Wbs> getWbslist() {
		return wbslist;
	}

	/**
	 * @param wbslist the wbslist to set
	 */
	public void setWbslist(List<Wbs> wbslist) {
		this.wbslist = wbslist;
	}


	
	
	

}