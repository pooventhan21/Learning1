package com.learning.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="laptop_table")
public class Laptop {
	@Id
	private int lno;
	private String lapname;
	@OneToOne
	private Student listStudent = new Student();
	
	@Override
	public String toString() {
		return "Laptop [lno=" + lno + ", " + (lapname != null ? "lapname=" + lapname + ", " : "")
				+ (listStudent != null ? "listStudent=" + listStudent : "") + "]";
	}
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public Student getListStudent() {
		return listStudent;
	}
	public void setListStudent(Student listStudent) {
		this.listStudent = listStudent;
	}
	
	
	

}
