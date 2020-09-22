package project1;

public class Employee_wages
  { public static void main(String[] args)
	 {   //Constant
		 int WAGE_PER_HOUR=20;
		 
		 //Variables
		 int emphours;
		 int empwage;
		 
		 //Computation
		 int empcheck= (int) (Math.floor( Math.random() * 10) % 3);
		 switch (empcheck)
		   {
		    case 1 :
		       { emphours=8; 
		          break ; }
		    case 2 :
		       { emphours=8; 
		          break ; }
		    default :
		       { emphours=0;
		          break ;}
		   }
		 empwage= emphours*WAGE_PER_HOUR;
		 
		 //Printing output
		 System.out.println("Employee status is "+empcheck);
		 System.out.println("Employee Wage is "+empwage);

	   }
}
