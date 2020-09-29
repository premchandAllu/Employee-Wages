package project1;
import java.util.*;
public class EmpWageBuilder implements IComputeEmpWage {
	// static variables
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;

	private ArrayList<Employee_wages> companyEmpWageList;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<>();
	}

	public void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		Employee_wages companyEmpWage = new Employee_wages(empWagePerHour, workDaysPerMonth, workHoursPerMonth,
				companyName);
		companyEmpWageList.add(companyEmpWage);
	}

	public void ComputeEmpWage() {
		for (Employee_wages company: companyEmpWageList) {
			 ComputeEmpWage(company);
			System.out.println("Employee wage of the "+company.getCompanyName()+"is : "+company.getTotalEmpWage());
			System.out.println("Employee wage of the "+company.getCompanyName()+"is : "+company.getDailyEmpWage());
		}
	}

	private int ComputeEmpWage(Employee_wages Employee_wages) {
		// TODO Auto-generated method stub
		int empWage = 0;
		int hoursWorked = 0;
		int empHours = 0;
		int dayCount = 0;

		// computation
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		switch (empCheck) {
		case 1:
			empCheck = IS_FULL_TIME;
			System.out.println("Employee is Present & Full Time");
			empHours = 8;
			break;

		case 2:
			empCheck = IS_PART_TIME;
			System.out.println("Employee is Present & Part Time");
			empHours = 4;
			break;

		default:
			System.out.println("Employee is Absent");
			break;
		}
		// daily wage calculation
		empWage = empHours * Employee_wages.empWagePerHour;
		// Tabular display of employee details
		System.out.println("company\t\tDay\tHours Worked\tTotal Wage");
		while ((hoursWorked + empHours) <= Employee_wages.workHoursPerMonth
				&& dayCount < Employee_wages.workDaysPerMonth) {
			dayCount++;
			hoursWorked += empHours;
			Employee_wages.totalEmpWage += empWage;
			System.out.println(" " + Employee_wages.companyName + " \t" + dayCount + " \t" + hoursWorked + " \t\t"
					+ Employee_wages.totalEmpWage);
		}
		if (hoursWorked < Employee_wages.workHoursPerMonth && dayCount < Employee_wages.workDaysPerMonth) {
			dayCount++;
			hoursWorked += (Employee_wages.workHoursPerMonth - hoursWorked);
			Employee_wages.totalEmpWage += (Employee_wages.workHoursPerMonth - hoursWorked)
					* Employee_wages.empWagePerHour;
			System.out.println(" " + Employee_wages.companyName + " \t" + dayCount + " \t" + hoursWorked + " \t\t"
					+ Employee_wages.totalEmpWage);
		}
		return Employee_wages.totalEmpWage;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome Message
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage(20, 15, 100, "Company A");
		empWageBuilder.addCompanyEmpWage(10, 20, 90, "Company B");
		empWageBuilder.ComputeEmpWage();
	}
}

