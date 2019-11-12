package com.java.core.model;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


class Names implements Comparable<Names>{
	private String name;

	public Names(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		
		// TODO Auto-generated method stub
		if(name.length()==obj.name.length()){
			return 0;
		}else if(name.length()<obj.name.length())
		{
			return -1;
		}else 
		return 0;
	}
	
}

public class ListInterfaceJp  {

	public static void main(String[] args){
	/*	List<String>str=new LinkedList<String>();
		str.add("Jinu");
		str.add("Manu");
		str.add("Preethu");
		str.add("pinki");
		ListInterfaceJp itr=new ListInterfaceJp();
		itr.diaplayList(str);*/
		
		
	}
	public void diaplayList(List<String>list){
 ListIterator<String> str=list.listIterator();
 while(str.hasNext()){
	 System.out.println("Element's"+str.next());
	 
 }

	}

}
