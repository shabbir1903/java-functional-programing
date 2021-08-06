package functional.interfaces;

public class Employee {
	
	private int empId;
	private String empName;
	private int depId;
	private String status="active";
	private int salary;
	
	
	public Employee(int empId, String empName, int depId, String status, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.depId = depId;
		this.status = status;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", depId=" + depId + ", status=" + status
				+ ", salary=" + salary + "]";
	}
	
	

}
