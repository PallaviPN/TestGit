package com.ninja.training;

import java.util.Scanner;

public class User_input_movie_arrayloop {
	
	public static void main(String[] args) {
/*
 * 
 * Keep getting input from user  for 5 times. Store all the inputs given by the user in an array. 
 * Loop through the array using For Each loop and print all the movie names entered by the user. 
 * 
 * 
 */
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter names of 5 movies");
		String user_input1= sc.nextLine();
		String user_input2= sc.nextLine();
		String user_input3= sc.nextLine();
		String user_input4= sc.nextLine();
	    String user_input5= sc.nextLine(); 
	    sc.close();
	  
	  		String[] s1= {user_input1,user_input2,user_input3 , user_input4, user_input5};
		
		for(String st: s1)
		{	
		
		System.out.println("The movies entered are \t"+ st);	
			
		} 

	}

}
