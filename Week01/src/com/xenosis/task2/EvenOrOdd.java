package com.xenosis.task2;

import java.util.Scanner;

public class EvenOrOdd 
{

	public static void main(String[] args) 
	{
		

		Scanner sc=new Scanner(System.in);
		
		//Taking User Input
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		sc.close();
		
		
		//Logic for Even and Printing Result
		if(number%2==0)
			System.out.println(number+" is even number");
		else
			System.out.println(number+" is odd number");
	}

}
