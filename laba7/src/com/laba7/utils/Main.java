package com.laba7.utils;

public class Main {

	public static void main(String[] args) {
		
		Publication book = new Book("Че нить","Я",400);
		Book b = new Book("Гари потер","Cтефаненков",320);
		Publication magazin = new Magazin("Че нить","Я",120);
		b.printInfo();
		book.prinInfo();
		book.displayInfo();
		magazin.displayInfo();
	}
	
}
