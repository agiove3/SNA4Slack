package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	/**
	 * This is the main entry of the application
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int counter=0;
		System.out.println("Hello World!");
		try {
			System.out.println("This is a bug!");
		}
		catch(Exception e) {
			
		}
//		boolean value = false;
//		if (value = true) {
//		    //do Something
//		} else {
//            //else Do Something
//	    }
		
	}
	
	public void doSomething() {
		  try {
		    FileInputStream fis = new FileInputStream("/tmp/bugger");
		  } catch (IOException ioe) {
		      // not good
		  }
		}

}
