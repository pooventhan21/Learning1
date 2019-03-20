package com.learning.DemoHib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * POJO classes
 * @author Pooventhan
 *
 */
@Entity(name="student_table")
public class Student {
    @Id
	private int sid;
	private StudentName sname;
	private String sclass;
	@OneToMany(mappedBy="listStudent")
	private List<Laptop> lp = new ArrayList<Laptop>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	
	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public StudentName getSname() {
		return sname;
	}

	public void setSname(StudentName sname) {
		this.sname = sname;
	}

	public List<Laptop> getLp() {
		return lp;
	}

	public void setLp(List<Laptop> lp) {
		this.lp = lp;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", " + (sname != null ? "sname=" + sname + ", " : "")
				+ (sclass != null ? "sclass=" + sclass + ", " : "") + (lp != null ? "lp=" + lp : "") + "]";
	}

}
