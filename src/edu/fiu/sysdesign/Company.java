/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author STEEB
 *
 */
public class Company {

	private String companyName;
	private Employee[] myEmployees;
	
	public Company(String name) {
		this.companyName = name;
		myEmployees= new Employee[10];
	}
	
	public int numberofEmployees() {
		return myEmployees.length;
	}
	public String toString() {
		return companyName;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company mycompany = new Company("SmartRF Solutions");
		
		System.out.println("New company: " + mycompany);
		System.out.println("Number of Employees: " + mycompany.numberofEmployees);

	}

}
