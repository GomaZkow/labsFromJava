package com.example;
import com.example.domain. *;
public class SoftwareTest {
    public static void main(String[] args) {
	ModileApp app1 = new ModileApp("ChatApp", "2.1", "TechSoft", 0.0, true);
	DekstopApp app2 = new DekstopApp("PhotoEditor", "5.3", "DesignPro", 49.99, true);

	System.out.println("Mobile App:");
	System.out.println("Name: " + app1.getName());
	System.out.println("Version: " + app1.getVersion());
	System.out.println("Developer: " + app1.getDeveloper());
	System.out.println("Price: $" + app1.getPrice());
	System.out.println("Android: " + app1.isAndroid());
	System.out.println("\nDesktop App:");
	System.out.println("Name: " + app2.getName());
	System.out.println("Version: " + app2.getVersion());
	System.out.println("Developer: " + app2.getDeveloper());
	System.out.println("Price: $" + app2.getPrice());
	System.out.println("Cross-platform: " + app2.isCrossPlatform());


    }
}
