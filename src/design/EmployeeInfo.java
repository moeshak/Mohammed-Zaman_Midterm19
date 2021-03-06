package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	 /*
	 declare few static and final fields and some non-static fields
	 */
	 private int employeeId;
	 private String employeeName;
	 private String department;
	 private int salary;
	 private int benefitLayout;
	 private String joiningDate;
	 private static String companyName;

	 public int getEmployeeID() { return employeeId; }

	 public void setEmployeeID(int employeeID) {this.employeeId = employeeID; }

	 public String getEmployeeName() { return employeeName; }

	 public void setEmployeeName(String employeeName) {this.employeeName = employeeName; }

	 public String getDepartment() { return department; }

	 public void setDepartment(String department) {this.department = department; }

	 public int getSalary() { return salary; }

	 public void setSalary(int salary) { this.salary = salary; }

	 public int getBenefitLayout() {return benefitLayout; }

	 public void setBenefitLayout(int benefitLayout) {this.benefitLayout = benefitLayout; }

	 public String getJoiningDate() { return joiningDate; }

	 public void setJoiningDate(String joiningDate) { this.joiningDate = joiningDate; }

	 public static String getCompanyName() { return companyName; }

	 public static void setCompanyName(String companyName) { EmployeeInfo.companyName = companyName; }

	 /*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	 /*
	 * You must have multiple constructor.
	 * Must implement below constrcutor.
	 */


	 public EmployeeInfo(int employeeID, String employeeName, String department, String joiningDate, int salary) {

		 this.employeeName = employeeName;
		 this.department = department;
		 this.department = department;
		 this.joiningDate = joiningDate;
		 this.salary = salary;
		 System.out.println("EmpID: " + employeeID +"\nEmpName: " + employeeName +"\nDepart:" +department +"\nStart: "
				 + joiningDate+"\nSalary "+salary);
	 }

	 public EmployeeInfo(String name, int employeeId) {
		 this.employeeName = name;
		 this.employeeId = employeeId;
	 }

	 public EmployeeInfo() {
	 }

	 /*
	  * This methods should calculate Employee bonus based on salary and performance.
	  * Then it will return the total yearly bonus. So you need to implement the logic.
	  * hints: 10% of the salary for best performance, 8% of the salary for the average performance and so on.
	  * You can set arbitrary number for performance.
	  * So you probably need to send 2 arguments.
	  *
	  */
	  public static double calculateEmployeeBonus(int numberOfYearsWithCompany, int salary) {
	  	   double yearlyBonus = 0;
	  	   if (numberOfYearsWithCompany > 4) {
			   yearlyBonus = yearlyBonus = 0.1;
		   } else if (numberOfYearsWithCompany >= 3) {
			   yearlyBonus = yearlyBonus * .08;
		   } else if (numberOfYearsWithCompany ==2) {
			   yearlyBonus = yearlyBonus * .05;
		   } else if (numberOfYearsWithCompany ==1) {
			   yearlyBonus = yearlyBonus * 0.2;
		   } else {
	  	   	   yearlyBonus = .01;}
	  	       return yearlyBonus;
		   }

		   /*
		    * This methods should calculate employee Pension based on salary and numbers of years with the company.
		    * Then it will return the total pension. So you need to implement the logic.
		    * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
		    *
		    */
		    public static int calculateEmployeePension () {
				int total = 0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter start date in format (example: May,2015): ");
				String joiningDate = sc.nextLine();
				System.out.println("Please enter today's date in format (example: August,2017): ");
				String todaysDate = sc.nextLine();
				String convertedJoiningDate = "DateConversion.convertDate(joiningDate)";
				String convertedTodaysDate = "DateConversion.convertDate(todaysDate)";

				//implement numbers of year from above two dates
				//Calculate pension

				return total;

				class DataConversion {

				public Months months{
				}

				public  String convertDate(String date) {
					String[] extractMonth = date.split(",")
					String givenMonth = extractMonth[0];
					int monthDate = whichMonth(givenMonth);
					String actualDate = monthDate + "/" + extractMonth[1];
					return actualDate;
				}

				public  int whichMonth(String givenMonth) {
					Months months = Months.valueOf(givenMonth);
					int date = 0;
					switch (months) {
						case January:
							date = 1;
							break;
						case February:
							date = 2;
							break;
						case March:
							date = 3;
							break;
						case April:
							date = 4;
							break;
						case May:
							date = 5;
							break;
						case June:
							date = 6;
							break;
						case July:
							date = 1;
							break;
						case August:
							date = 1;
							break;
						case September:
							date = 1;
							break;
						case October:
							date = 1;
							break;
						case November:
							date = 1;
							break;
						case December:
							date = 1;
							break;
						default:
							date = 0;
							break;

					}
					return date;


				}
			}









