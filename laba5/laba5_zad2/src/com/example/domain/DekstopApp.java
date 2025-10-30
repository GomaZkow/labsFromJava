package com.example.domain;

public class DekstopApp extends Software {
    private boolean isCrossPlatform;

    public DekstopApp() {}

    public DekstopApp(String name, String version, String developer, double price, boolean isCrossPlatform) {
	super(name, version, developer, price);
	this.isCrossPlatform = isCrossPlatform;
    }

    public boolean isCrossPlatform() 
    { 
	return isCrossPlatform; 
    }
    public void setCrossPlatform(boolean isCrossPlatform)
    { 
	this.isCrossPlatform = isCrossPlatform;
    }
    
    
}
