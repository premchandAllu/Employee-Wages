package project1;

public class Employee_wages
  { public static void main(String[] args)
	 {   //Constants
	     int WAGE_PER_HOUR=20;
	     int NO_OF_DAYS=20;
	     
	     //Variables
	     int emphours;
	     
	     //Computation
	     int empcheck = (int) (Math.floor(Math.random() * 10 ) % 3);
	     
	     switch (empcheck)
	     { 
	     case 1 :
	     { emphours =8;
	        break; }
	     case 2 :
	     { emphours=8;
	       break ; }
	     default :
	     { emphours =0;
	       break ; }
	     }
	     int monthly_wage = WAGE_PER_HOUR * emphours * NO_OF_DAYS ;
	     //Printing Output
	     System.out.println("Employee status is"+empcheck);
	     System.out.println("Monthly Wage of Employee is "+monthly_wage);
	   }
}
