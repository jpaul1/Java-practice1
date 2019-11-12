package com.java.core.model;

import java.util.ArrayList;

public class AutoboxingAndBoxing {

	public int intValue;

	public AutoboxingAndBoxing(int intValue) {
		super();
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
	public static void main(String[] args){
		ArrayList<Integer>Student=new ArrayList<Integer>();
		Student.add(new AutoboxingAndBoxing(24));
		
	}
}
