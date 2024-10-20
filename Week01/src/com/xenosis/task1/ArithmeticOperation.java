package com.xenosis.task1;

import java.util.Scanner;

public class ArithmeticOperation 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		//Taking User Input 
		System.out.println("Enter first number");
		int firstNumber=sc.nextInt();
		
		System.out.println("Enter second number");
		int secondNumber=sc.nextInt();
		
		//Arithmetic Operation
		int addition=firstNumber+secondNumber;
		int substraction=firstNumber-secondNumber;
		int multiplication=firstNumber*secondNumber;
		
		//Logic For Division
		int division=0;
		if(secondNumber>0)
		{
			division=firstNumber/secondNumber;

		}
		else
			System.out.println("plz provide correct second number which is greater then zero for division");
        
		//Printing Result
		System.out.println("Addition = "+addition);
                System.out.println("Substraction = "+substraction);
                System.out.println("Multiplication ="+multiplication);
                System.out.println("Division = "+division);
                sc.close();//closing resource
	}

}
