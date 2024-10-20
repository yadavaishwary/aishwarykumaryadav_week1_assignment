package com.xenosis.task3;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args)
	{
		
         Scanner sc=new Scanner(System.in);
		
		
         
        
        while(true)
        {  
        	//Printing Calculator Operation Options/Menu
 		    System.out.println("******Simple Calculator Operation******");
		    System.out.println("for addition type 1"+"\n"+"for substraction type 2"+"\n"+"for multiplication type 3"+"\n"+"for division type 4"+"\n"+"for exit type 5");
		
		    System.out.println("enter the choice ");
		    int choice=sc.nextInt();
		
		
		
		
		    //Performing Operations and printing result 
		    switch(choice)
		    {
		      case 1:
		      {
			
			    System.out.println("Enter first value ");
		 		int firstValue=sc.nextInt();
		 		System.out.println("Enter Second Value ");
		 		int secondValue=sc.nextInt();
		 		  
			    int result=firstValue+secondValue;
			    System.out.println("Addition of two number is: "+result);
                
			    break;
		      }
		      case 2:
		      {
			     System.out.println("Enter first value ");
		 	     int firstValue=sc.nextInt();
		 		 System.out.println("Enter Second Value ");
		 		 int secondValue=sc.nextInt();
		 		 
			     int result=firstValue-secondValue;
			     System.out.println("Substraction of two number is: "+result);
		        
			     break;
		       }
		       case 3:
		       {
			      System.out.println("Enter first value ");
		 		  int firstValue=sc.nextInt();
		 		  System.out.println("Enter Second Value ");
		 		  int secondValue=sc.nextInt();
		 		 
			      int result=firstValue*secondValue;
			      System.out.println("Multiplication of two number is: "+result);
			    
			      break;
		       }
		       case 4:
		       {
			      System.out.println("Enter first value ");
		 		  int firstValue=sc.nextInt();
		 		  System.out.println("Enter Second Value ");
		 		  int secondValue=sc.nextInt();
		 		 
			      if(secondValue>0)
			      {
				    int result=firstValue/secondValue;
				    System.out.println("Division of two number is: "+result);
				 
				    break;
			       }
			       else 
			       {
				     System.out.println("please enter valid second number which is greater than zero");
				     sc.close();//closing resource
				     break;
				   }
		        }
		        case 5:
			    {
				   System.out.println();
				   System.exit(0);
		        }
		        default: System.out.println("Invalid Option try again!!");

	    }
       }
	}

}
