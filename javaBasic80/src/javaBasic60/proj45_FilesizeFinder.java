package javaBasic60;

import java.io.File;
import java.util.Scanner;

public class proj45_FilesizeFinder {

	static File myFile;
	
    public static void main(String[] args) {
    	
    	myFile = new File("C:/Users/effie/Desktop/Title Manuscript.pdf");
    	example();
    	myFile = new File("C:/Users/effie/Desktop/Chapter1-3.docx");
    	example();
    	
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String inputFilePath = sc.nextLine().trim();

        File inputFile = new File(inputFilePath);
        long inputFileSize = inputFile.length();

//        System.out.printf("Input file size: %d bytes", inputFileSize);

        sc.close();
    }
    
    static void example() {
        long fileSize = myFile.length();
        System.out.println(myFile + " : " + fileSize + " bytes");
    }
    
}
