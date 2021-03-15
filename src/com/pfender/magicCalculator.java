package com.pfender;
import java.lang.Math; 

public class magicCalculator extends Calculator 
{
    public int sqrt(int num1)
    {
    	int squareRoot = (int) Math.sqrt(num1);
    	return squareRoot;
    }
    
    public int sin(int num1)
    {
    	int sine = (int) Math.sin(num1);
    	return sine;
    }
    
    public int cos(int num1)
    {
    	int cosine = (int) Math.cos(num1);
    	return cosine;
    }
    
    public int tan(int num1)
    {
    	int tangent = (int) Math.tan(num1);
    	return tangent;
    }
    
    public int factorial(int num1)
    {    
    	  if (num1 == 0)    
    	    return 1;    
    	  else    
    	    return(num1 * factorial(num1 - 1));    
    }    
    
    
 public static void main(String[] args) {
	    
	    int num1 = 4;
	    int num2 = 15;

	    magicCalculator obj = new magicCalculator();
	    // choose method here
	    int result = obj.factorial(num1);
	    System.out.println("The answer is: " + result);

}
 
}
