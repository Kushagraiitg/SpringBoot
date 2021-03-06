package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class MyBean {
	
	private int aid;
	private String aname;
	private String atech;
	@Autowired
	@Qualifier("lap")
	private Lap lapt;
	public Lap getLapt() {
		return lapt;
	}
	public void setLapt(Lap lapt) {
		this.lapt = lapt;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	public void show() {
		System.out.println(" Show is here!");
		lapt.compile();
	}
	public MyBean() {
		super();
		System.out.println("Obj created");
	}
}
