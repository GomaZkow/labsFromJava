package com.example.domain;

public class Software {
    public String name;
    private String version;
    private String developer;
    private double price;

    public Software() {
	System.out.println("я родился");
    }
    public Software(String name,String version,String developer,double price) {
	this.name = name;
	this.version = version;
	this.developer = developer;
	this.price = price;
    }

    public String getName() 
    {
	return name; 
    }
    public void setName(String name) 
    { 
	this.name = name;
    }

    public String getVersion() { 
	return version;
    }
    public void setVersion(String version) {
	this.version = version;
    }

    public String getDeveloper() { 
	return developer; 
    }
    public void setDeveloper(String developer) { 
	this.developer = developer;
    }

    public double getPrice() 
    {
	return price; 
    }
    public void setPrice(double price) {
	this.price = price; 
    }
    public void PrintInfo(){
	System.out.println(name+version+developer+price);
	
    }
   
		
	{
    }
    

}