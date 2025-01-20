package javaBasic60;

public class proj31_CheckJavaInstallation {

	public static void main(String[] args) {
        //Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));
        
        //Java runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        
        //Java home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));
        
        //Java vendor name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        
        //Java vendor URL
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        
        //Java class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

	}

}
