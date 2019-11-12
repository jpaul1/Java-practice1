package com.java.core.model;

import java.util.Stack;

public class StackMethod {
	public static void main(String[] args){
		Stack<Integer>str=new Stack<>();
		str.push(1);
		str.push(2);
		str.push(3);
		str.push(4);
		for(Integer tem:str){
			System.out.println(tem);
		}
		
	}

}
