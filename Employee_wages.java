package project1;

public class Employee_wages
  { 	  //Constants
	      public static final  int WAGE_PER_HOUR=20;
	      public static final int NO_OF_DAYS=20;
	      public static final int NO_OF_HOURS=100;
	      public static final int IS_FULL_TIME=1;
	      public static final int IS_PART_TIME=2;
	      
	   public static void main(String[] args)
	    { 
	     //Variables
	     int emphours;
	     int empwage;
	     
	     //Computation
	     int empcheck = (int) (Math.floor(Math.random() * 10 ) % 3);
	     
	     switch (empcheck)
	     { 
	     case IS_FULL_TIME :
	     { emphours =8; 
	       System.out.println("Employee status -Full time");
	        break; }
	     case IS_PART_TIME :
	     { emphours=4;
	       System.out.println("Employee status -Part time");
	       break ; }
	     default :
	     { emphours =0;
	       System.out.println("Employee status -Absent");
	       System.exit(0); }
	     }
	    
	     if(NO_OF_HOURS/emphours < NO_OF_DAYS && emphours!=0)
	     { empwage= NO_OF_HOURS* WAGE_PER_HOUR;
	       System.out.println("Employee wage for 100 hours is "+empwage);
	       
	     }
	     else if(NO_OF_HOURS/emphours >= NO_OF_DAYS && emphours !=0)
	     { empwage= emphours*WAGE_PER_HOUR*NO_OF_DAYS ;
	       System.out.println("Employee wage for 20 days is"+empwage);
	       }
	     }
}
