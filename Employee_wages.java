package project1;

public class Employee_wages
  { public static void main(String[] args)
	 { 
	   //Constants
	   int IS_FULL_TIME =1;
	   int WAGE_PER_HOUR = 20;
	   
	   //Variables
	   int empwage;
	   int emphours;
	   
	   // Computation
	   double empcheck=Math.floor(Math.random() *10)%2;
	    
       if(empcheck==IS_FULL_TIME)
           {   emphours=8; }
       else 
           { 	 emphours=0; }
        
        empwage= emphours * WAGE_PER_HOUR;
        
      // Printing output
       System.out.println("Daily Employee Wage is"+empwage); 
	 }
    
}
