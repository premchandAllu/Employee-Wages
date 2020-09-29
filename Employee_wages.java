package project1;

public class Employee_wages {
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	
        //variable
	private int noOfCompany=0;
    private EmployeeWageComputation[] EmpWageArray;
    
	public Employee_wages() {
	  EmpWageArray=new EmployeeWageComputation[5];
	}
	public void addCompanyEmpWage(String company, int WAGE_PER_HOUR, int NO_OF_HOURS, int NO_OF_DAYS) {
		EmpWageArray[noOfCompany]=new EmployeeWageComputation(company, WAGE_PER_HOUR, NO_OF_HOURS, NO_OF_DAYS);
		noOfCompany++;
	}

	private void computeEmpWage() {
		for(int i=0; i<noOfCompany; i++) {
			EmpWageArray[i].setTotalEmpWage(this.computeEmpWage(EmpWageArray[i]));
			System.out.println(EmpWageArray[i]);
			System.out.println("\n");
		}
	}
	public class EmployeeWageComputation 
	{
		//variables
		public final String company;
		public final int WAGE_PER_HOUR;
		public final int NO_OF_HOURS;
		public final int NO_OF_DAYS;
		public int totalEmpwage;
		
		public EmployeeWageComputation(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth) {
			this.company=company;
			this.WAGE_PER_HOUR=empWagePerHour;
			this.NO_OF_HOURS=maxHoursAMonth;
			this.NO_OF_DAYS=workingDayMonth;
		}
		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpwage=totalEmpWage;
		}
		@Override
		public String toString() {
			return "Total employee wage for "+company+" is "+totalEmpwage;
		}
	}
	private int computeEmpWage(EmployeeWageComputation employeewage) {
		//variables
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		//Computation
		while(totalEmpHours<employeewage.NO_OF_HOURS && totalWorkingDays<employeewage.NO_OF_DAYS) {
			totalWorkingDays++;
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch(empCheck) {
			case IS_FULL_TIME:
				empHours=8;
				break;
			case IS_PART_TIME:
				empHours=4;
				break;

			default:
				empHours=0;
			}
			if (totalEmpHours<96) {
				totalEmpHours+=empHours;
				System.out.println("Days : "+totalWorkingDays+"\tEmployee hour : "+empHours+"\tTotal hours "+totalEmpHours);
			}
			else {
				totalEmpHours+=(100-totalEmpHours);
				System.out.println("Days : "+totalWorkingDays+"\tEmployee hour : "+empHours+"\tTotal hours "+totalEmpHours);
				break;
			}
		}
		return totalEmpHours*employeewage.WAGE_PER_HOUR;
	}
	public static void main(String[] args) {
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");
		Employee_wages empWage=new Employee_wages();
		empWage.addCompanyEmpWage("Reliance", 15, 110, 20);
		empWage.addCompanyEmpWage("Amazon", 18, 115, 22);
		empWage.addCompanyEmpWage("Capgemini", 20, 100, 20);
		empWage.computeEmpWage();
	}

}
