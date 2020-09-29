package project1;

public interface IComputeEmpWage {
	
	public void ComputeEmpWage();

	public void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName);
     
	public int getTotalEmpWage(String company);
}
