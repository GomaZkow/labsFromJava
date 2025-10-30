package com.example.domain;

public class ModileApp extends Software {
    private boolean isAndroid;

    public  ModileApp(String name, String version, String developer, double price, boolean isAndroid)
    {
	super(name,version,developer,price);
	this.isAndroid = isAndroid;

    }
    public boolean isAndroid() {
	return isAndroid;
    }
    public void setAndroid(boolean isAndroid) {
	this.isAndroid=isAndroid;
    }
    @Override
    public void PrintInfo(){
   	System.out.println(isAndroid);
       }
}
