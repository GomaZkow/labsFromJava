package com.laba7.utils;

public abstract class Publication {
	protected String Name;
	protected String Author;


	
	Publication(String Name, String Author){
		 this.Name = Name;
	     this.Author = Author;
	}
	

	public void prinInfo(){
		System.out.println(Name+Author);
	}


	public abstract void displayInfo();

}
