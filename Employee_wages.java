package project1;

public class Employee_wages
  { public static void main(String[] args)
	 { 
	        //Constants
			int IS_PART_TIME=1;
			int IS_FULL_TIME=2;
			int WAGE_PER_HOUR=20;
			
			//Variables
			int emphours;
			int empwage;
			
			//Computation
			int empcheck= (int) ( Math.floor(Math.random() * 10) %3 );
			 System.out.println("Employee Status is "+empcheck);
			 
			   if(empcheck==IS_PART_TIME)
			     { emphours=8;}
			   else if(empcheck==IS_FULL_TIME)
			     { emphours=8;}
			   else
			     { emphours=0;}
			   
			 empwage=emphours*WAGE_PER_HOUR;
			 
			 //Printing Output
	        System.out.println("Employee wage is "+empwage);
	 }
    
}
