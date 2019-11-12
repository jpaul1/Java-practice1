package com.java.core.model;

import java.util.HashMap;
import java.util.Map;

public class MapInterp {
	public static void main(String[] args){
		Map<Integer,String>mpr=new HashMap<>();
		mpr.put(1, "Jeffin");
		mpr.put(2,"jins");
		mpr.put(3,"billu");
		mpr.put(4,"meera");
		for(Map.Entry<Integer,String> entry:mpr.entrySet()){
			System.out.println("Key:-"+entry.getKey()+"Value"+entry.getValue());
		}
	}

}
