package project1;

public class Employee_wages
  {    
	      //Constants
	      public static final int IS_FULL_TIME=1;
	      public static final int IS_PART_TIME=2;
	   
	      //Variables
	      int empwage=0;
	      int emphours=0;
	    
	public int calculateWage( String company,int WAGE_PER_HOUR,int NO_OF_DAYS,int NO_OF_HOURS )
    {
         //Variables
		   int totaldays=0;
		   int totalemphours=0;
		      
	     //Computation
	     	     
	     while(totaldays<NO_OF_DAYS && totalemphours<NO_OF_HOURS)
	     {   
	    	 int empcheck = (int) (Math.floor(Math.random() * 10 ) % 3);
	    
	          switch (empcheck)
	           { 
	            case IS_FULL_TIME :
	              { emphours =8; 
	                break; }
	            case IS_PART_TIME :
	              { emphours=4;
	                break ; }
	            default :
	              { emphours =0;
	                break ; }
	            }
	          totalemphours +=emphours;
	          
	          //Total wage computation 
	          empwage= totalemphours * WAGE_PER_HOUR;
	     }
	    return empwage;
    }
	   public static void main(String[] args)
	     {
		   
		  Employee_wages obj1 =new Employee_wages( );
		  int amazon = obj1.calculateWage( "Amazon",20,20,100 );
		  
		  //Display of Employee Total Wage for company 1
		  System.out.println("Employee total wage for company 1 is "+amazon);
		  
		  Employee_wages obj2=new Employee_wages( );
		  int capgemini= obj2.calculateWage("Capgemini",25,20,150  );
		  
		  //Display of Employee Total Wage for Company 2
		  System.out.println("Employee total wage for company 2 is "+capgemini);
	     }
 
  }   
	    
