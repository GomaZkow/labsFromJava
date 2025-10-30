package com.laba7.utils;
public class Magazin extends Publication {
	private int CountExrmplar;
	
	Magazin(String Name, String Author,int CountExrmplar) {
		super(Name, Author);
		
		this.CountExrmplar = CountExrmplar; 
	}
	
	@Override
	public void displayInfo() {
		System.out.println(Name+Author+CountExrmplar);
	}


}
