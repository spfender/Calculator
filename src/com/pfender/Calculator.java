package com.pfender;

public class Calculator 
{

	  // method
	  public int add(int num1, int num2) 
	  {
	    int sum = num1 + num2;
	    return sum;
	  }
	  
	  public int subtract(int num1, int num2)
	  {
		  int ansSub = num1 - num2;
		  return ansSub;
	  }
	  
	  public int multiply(int num1, int num2)
	  {
		  int product = num1 * num2;
		  return product;
	  }
	  
	  public int divide(int num1, int num2)
	  {
		  int div = num1 / num2;
		  return div;
	  }
	  
	  public int square(int num1)
	  {
		  int sq = num1 * num1;
		  return sq;
	  }

//	  vvv moved to magicCalculator vvv
//	  public static void main(String[] args) 
//	  {
//	    
//	    int num1 = 25;
//	    int num2 = 15;
//
//	    Calculator obj = new Calculator();
//	    // choose method here
//	    int result = obj.multiply(num1, num2);
//	    System.out.println("The answer is: " + result);
//	  }	  
}

	

