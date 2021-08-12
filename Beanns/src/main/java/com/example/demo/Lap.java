package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Lap {
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLbrand() {
		return lbrand;
	}
	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}
	private int lid;
	private String lbrand;
	public void compile() {
		System.out.println("Compiling");
	}
}
