package com.StudentMarks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) throws IOException {
	 Scanner sc = new Scanner(System.in);
	 String subjects[] = {"Corejava","Html","Css","Bootstrap","Es6","Spring","Hibernate"};
	 int[] marks = new int[7];
	 System.out.println("Student Marks");
	   
	    for(int i=0;i<7;i++)
	    {
	    	System.out.println("please enter marks in"+subjects[i]);
	    	marks[i]=sc.nextInt();
	    	
	    }
	     int max = marks[0];
	     int index = 0;
	     for(int i=0;i<marks.length;i++)
	     {
	    	 if(max<marks[i])
	    	 {
	    		 max = marks[i];
	    		 index = i;
	    	 
	     }
	     }
	System.out.println("Highest Marks in subjects[index] are:"+max);

	
	FileOutputStream fos = new FileOutputStream("result.txt",true);
	String txt1 = "Your results are stored in a file please check in to results.txtfile";
	byte b[] = txt1.getBytes();
	fos.write(b);
	System.out.println("operation success");
	fos.close();
	
	
	FileReader fr = null;

	 try
     {
         fr = new FileReader("result.txt");
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();    
     }
     catch(FileNotFoundException e)
     {
         e.printStackTrace();
     }
     finally {
         fr.close();
     }
	
	
	    		 
	     

}
}
