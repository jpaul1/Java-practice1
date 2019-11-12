package com.java.core.model;

public class ArrayList {
static java.util.ArrayList<String> str=new java.util.ArrayList<String>();
	public static void main(String[] args){
		str.add("jeffin");
		str.add("chand");
		str.add("Minu");
		str.add("Minnu");
		str.add("Charlse");
		//System.out.println(str);
		ArrayList arr=new ArrayList();
		arr.dislayList(str);
		
		
	}
	void dislayList(java.util.ArrayList<String> names){
		for(String name:names){
			System.out.println(name);
		}
		
	}
	void removeNamebyPosition(int position){
		
	}
	
	void removeNamebyString(int position){
		
	}
	
}
