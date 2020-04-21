package com.kimschool.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_test")
@NamedQueries({
	@NamedQuery(
			name = "Jpa_Test.findBypassword",
			query = "select j from Jpa_Test j where j.password = :password and j.id = :id"
			),
	@NamedQuery(
			name = "Jpa_Test.findpassword",
			query = "select j.password from Jpa_Test j where j.id = :id and j.email = :email"
			)
})

public class Jpa_Test {

	@Id
	private int no;
	private String id;
	private String password;
	// insert시 값이 들어가는걸 방지한다(null)
	@Column(insertable = false)
	private String auth1;
	// insert시 값이 들어가는걸 방지한다(null)
	@Column(insertable = false)
	private String status;
	// insert시 값이 들어가는걸 방지한다(null)
	@Column(insertable = false)
	private String reg_date;
	private String email;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the auth1
	 */
	public String getAuth1() {
		return auth1;
	}
	/**
	 * @param auth1 the auth1 to set
	 */
	public void setAuth1(String auth1) {
		this.auth1 = auth1;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}
	/**
	 * @param reg_date the reg_date to set
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Jpa_Test [id=" + id + ", no=" + no + ", password=" + password + ", auth1=" + auth1 + ", status="
				+ status + ", reg_date=" + reg_date + ", email=" + email + "]";
	}
	
	
	
}
