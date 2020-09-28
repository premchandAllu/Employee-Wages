package project1;

public class Employee_wages
  {    
	      //Constants
	      public static final int IS_FULL_TIME=1;
	      public static final int IS_PART_TIME=2;
	   
	      //Variables
	      int empwage=0;
	      int emphours=0;
	   
	   public int calculateWage(int a,int b,int c )
	    {
		   int WAGE_PER_HOUR = a;
		   int NO_OF_DAYS    = b;
		   int NO_OF_HOURS   = c;
         
		      
	     //Computation
	     int empcheck = (int) (Math.floor(Math.random() * 10 ) % 3);
	     
	     switch (empcheck)
	     { 
	     case IS_FULL_TIME :
	     { emphours =8; 
	       System.out.println("Employee  status - Full time");
	        break; }
	     case IS_PART_TIME :
	     { emphours=4;
	       System.out.println("Employee  status - Part time");
	       break ; }
	     default :
	     { emphours =0;
	       System.out.println("Employee  status - Absent");
	       break ; }
	     }
	     if(emphours==0)
	     { empwage =0; }
	     else if(NO_OF_HOURS/emphours < NO_OF_DAYS && emphours!=0)
	     { empwage= NO_OF_HOURS* WAGE_PER_HOUR;   
	     }
	     else if(NO_OF_HOURS/emphours >= NO_OF_DAYS && emphours !=0)
	     { empwage= emphours*WAGE_PER_HOUR*NO_OF_DAYS ;
	       }
	  
	    return empwage;
}
	   public static void main(String[] args)
	     {
		   
		  Employee_wages obj1 =new Employee_wages( );
		  int Total1 = obj1.calculateWage(20,20,100);
		  
		  //Display of Employee Total Wage for company 1
		  System.out.println("Employee total wage for company 1 is "+Total1);
		  
		  Employee_wages obj2=new Employee_wages( );
		  int Total2= obj2.calculateWage(25,20,150);
		  
		  //Display of Employee Total Wage for Company 2
		  System.out.println("Employee total wage for company2 is "+Total2);
	     }
 
  }   
	    
