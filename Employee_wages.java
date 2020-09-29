package project1;

public class Employee_wages {

	public final int empWagePerHour;
	public final int workDaysPerMonth;
	public final int workHoursPerMonth;
	public final String companyName;
	public int totalEmpWage;
	public int dailyEmpWage;

	public Employee_wages(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workDaysPerMonth = workDaysPerMonth;
		this.workHoursPerMonth = workHoursPerMonth;
	}
	
	public void setDailyEmpWage(int dailyEmpWage) {
		this.dailyEmpWage=dailyEmpWage;
	}
	
	public int getDailyEmpWage() {
		return dailyEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public int getEmpWagePerHour() {
		return empWagePerHour;
	}

	public int getWorkDaysPerMonth() {
		return workDaysPerMonth;
	}

	public int getWorkHoursPerMonth() {
		return workHoursPerMonth;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}
}
