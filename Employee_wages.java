package project1;

public class Employee_wages
  { 

		 //Constants
	      public static final  int WAGE_PER_HOUR=20;
	      public static final int NO_OF_DAYS=20;
	      public static final int NO_OF_HOURS=100;
	      public static final int IS_FULL_TIME=1;
	      public static final int IS_PART_TIME=2;
	      
	      //Variables
	      int empwage=0;
	      int daycount=0;
	      int hoursworked=0;
	      int totoalwage=0;
	      int emphours=0;
	      
	   public int calculateWage( )
	    { 
		 //Variables
		 int daycount=0;
         int hoursworked=0;
         int totalwage=0;
	     int emphours=0;
		      
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
	    
	     //Calculation of Daily wage
	     empwage= emphours * WAGE_PER_HOUR;
	     //Tabular display of Employee details
	     
	     while((hoursworked + emphours ) <= NO_OF_HOURS && daycount < NO_OF_DAYS)
	        { daycount ++;
	          totalwage =(NO_OF_HOURS- hoursworked) * WAGE_PER_HOUR;
	          hoursworked= NO_OF_HOURS;
	          System.out.println(" "+daycount+ " \t"+hoursworked+"  \t"+totalwage);
	          
	        }
	     
	    return totalwage;
}
	   public static void main(String[] args)
	     {
		   
		  System.out.println("Welcome to employee wage computation ");
		  Employee_wages obj =new Employee_wages();
		  int Total= obj.calculateWage();
		  
		  //Display of Employee Total Wage
		  System.out.println("Employee total wage is "+Total);
	     }
 
  }   
	    
