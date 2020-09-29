package project1;

public class Employee_wages {
 // TODO Auto-generated constructor stub\

 public final int WAGE_PER_HOUR;
 public final int NO_OF_DAYS;
 public final int NO_OF_HOURS;
 public final String company;
 public int totalEmpWage;

 public Employee_wages(String company,int WAGE_PER_HOUR, int NO_OF_DAYS, int NO_OF_HOURS) {
  this.company = company;
  this.WAGE_PER_HOUR = WAGE_PER_HOUR;
  this.NO_OF_DAYS = NO_OF_DAYS;
  this.NO_OF_HOURS = NO_OF_HOURS;
 }

 public void setTotalWage(int totalEmpWage) {
  this.totalEmpWage = totalEmpWage;
 }
}
