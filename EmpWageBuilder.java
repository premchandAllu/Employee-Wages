package project1;

public class EmpWageBuilder implements IComputeEmpWage {
	
	// static variables
	 public static final int IS_PART_TIME = 2;
	 public static final int IS_FULL_TIME = 1;

	 private int numOfCompanies = 0;
	 private Employee_wages[] EmpWageArrays;

	 public EmpWageBuilder() {
	  EmpWageArrays = new Employee_wages[5];
	 }

	 public void addCompanyEmpWage(String company, int WAGE_PER_HOUR, int NO_OF_DAYS, int NO_OF_HOURS) {
	  EmpWageArrays[numOfCompanies] = new Employee_wages(company, WAGE_PER_HOUR, NO_OF_DAYS, NO_OF_HOURS);
	  numOfCompanies++;
	 }

	 public void ComputeEmpWage() {
	  for (int i = 0; i < numOfCompanies; i++) {
	   int totalEmpWage = this.ComputeEmpWage(EmpWageArrays[i]);
	   System.out.println((EmpWageArrays[i].company) + "  total wage : " + totalEmpWage);
	  }
	 }

	 public int ComputeEmpWage(Employee_wages Employee_wages) {
	  // variables
	  int dayCount = 0;
	  int totalEmpHours = 0;
	  int empHour = 0;
	  // Computation
	  while (empHour <= Employee_wages.NO_OF_HOURS && dayCount <Employee_wages.NO_OF_DAYS) {
	   dayCount++;

	   int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

	   switch (empCheck) {
	   case 1:
	    empCheck = IS_FULL_TIME;
	    System.out.println("Employee Present - FULL TIME");
	    empHour = 8;
	    break;
	   case 2:
	    empCheck = IS_PART_TIME;
	    System.out.println("Employee Present - PART TIME");
	    empHour = 4;
	    break;
	   default:
	    System.out.println("Employee is Absent");
	    empHour = 0;
	    break;
	   }
	   totalEmpHours += empHour;

	   // Tabular Display of Employee Details for Maximum Monthly Hours or Days
	   System.out.println("Day\t" + dayCount + " Hours Worked\t" + empHour);
	  }
	  return totalEmpHours * Employee_wages.WAGE_PER_HOUR;
	 }

	 
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub

	  // Welcome Message
	  System.out.println("Welcome to Employee Wage Computation");
	  EmpWageBuilder empWageBuilder = new EmpWageBuilder();
	  empWageBuilder.addCompanyEmpWage("Capgemini", 20, 15, 100);
	  empWageBuilder.addCompanyEmpWage("Amazon", 10, 20, 90);
	  empWageBuilder.ComputeEmpWage();
	 }
	}


