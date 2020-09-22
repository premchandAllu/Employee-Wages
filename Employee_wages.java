package project1;

public class Employee_wages
  { public static void main(String[] args)
	  { 
	  // Constant
		int IS_FULL_TIME=1;
		 // Computation
		double empcheck =Math.floor(Math.random() *10)% 2;
		 
		if(empcheck==IS_FULL_TIME)
		     System.out.println("Employee is present");
	       
		else 
			 System.out.println("Employee is absent");
	
	  }
    
}
