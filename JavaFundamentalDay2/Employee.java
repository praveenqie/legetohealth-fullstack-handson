package JavaFundamentalDay2;

public class Employee extends Person {
	private int empId;
	private String empName;
	private String empCompany;
	

	public static void main(String[] args) {
		Employee  employee = new Employee("praveen","legato","hahah","male");
		employee.display();
	}
	
	public Employee() {}
	
	public Employee(String empName, String empCompany,String name,String gender) {
		super(name,gender);
		this.empName = empName;
		this.empCompany = empCompany;
	}
	
	public void display() { 
		System.out.println("Empname :"+empName+" Employee Company :"+empCompany+" Employee ID:"+empId);
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

}
