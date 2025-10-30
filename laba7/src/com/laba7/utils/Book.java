package com.laba7.utils;
public class Book extends Publication {
	
	public int Pages;
	
	Book(String Name, String Author,int Pages) {
		
		super(Name, Author);
		this.Pages=	Pages;
	}

	
	@Override
	public void displayInfo(){
		System.out.println(Name+Author+Pages);
	}

}
