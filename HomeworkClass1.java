package com.ninja.training;

import java.util.Scanner;

public class HomeworkClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. How many years elapsed between first and last movie of Harry Potter?
		
		int firstmovie= 2001;
		int lastmovie= 2011;
		
		// Years elapsed b/w first & last movie
		
		int years_elap= lastmovie-firstmovie;
		System.out.println("Years elapsed b/w first & last movie ="+ years_elap);
		
		
		//Calculate using formula and print answer in years and months.
		
		int approx_years_for_movie_release,Total_number_of_movies=8;
		
		approx_years_for_movie_release = (lastmovie - firstmovie) / Total_number_of_movies;

		System.out.println("The approx years for movie release= " + approx_years_for_movie_release);
		
		// Get a number as input from user and print the name of the movie
		
		System.out.println("Enter any number between 1 and 8");
		Scanner sc=new Scanner(System.in);
		   
		  int user_no = sc.nextInt();
		  
		   if(user_no ==1) 
		   {
			   System.out.println("The movie is Harry Potter and the Philosopher's Stone, This is the first movie" );
		   }
					   
			   else if (user_no==2)
			   {
				   System.out.println("The movie is   Harry Potter and the Chamber of Secrets, It is Not First or Last movie" );
			   }
		   
			   else if (user_no==3 )
			   {
				   System.out.println("The movie is Harry Potter and the Prisoner of Azkaban, It is Not First or Last movie" ); 
			   }
			  
			   else if (user_no== 4)
			   {
				   System.out.println("The movie is Harry Potter and the Goblet of Fire, It is Not First or Last movie" ); 
			   }
			   else if (user_no== 5)
			   {
				   System.out.println("The movie is Harry Potter and the Order of the Phoenix, It is Not First or Last movie" ); 
			   }
			   else if (user_no== 6)
			   {
				   System.out.println("The movie is Harry Potter and the Half-Blood Prince, It is Not First or Last movie" ); 
			   }
			   else if (user_no==7)
			   {
				   System.out.println("The movie is  Harry Potter and the Deathly Hallows – Part 1, It is Not First or Last movie" ); 
			   }
			   else if (user_no==8)
			   {
				   System.out.println("The movie is  Harry Potter and the Deathly Hallows – Part 2 , This is the last movie"); 
			   }
			   else {
				   System.out.println("Invalid input");
			   }
		
			
			 
			   
			   
		   
		  
	}

}
