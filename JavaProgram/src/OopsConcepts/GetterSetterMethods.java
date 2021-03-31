 package OopsConcepts;

class employee {
	private int empId;
	private String empName;
	private int empAge;
	private int empSalary;

	public String getName() {
		return empName;
	}

	public int getAge() {
		return empAge;
	}

	public int getSalary() {
		return empSalary;
	}

	public int getId() {
		return empId;
	}

	public void setName(String Name) {
		this.empName = Name;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public void setAge(int age) {
		this.empAge = age;
	}

	public void setSalary(int salary) {
		this.empSalary = salary;
	}

}

public class GetterSetterMethods {
	public static void main(String[] args) {
		employee emp = new employee();
		emp.setName("UMAMAHESH");
		System.out.println(emp.getName());
		emp.setId(1561);
		System.out.println(emp.getId());
		emp.setSalary(10000);
		System.out.println(emp.getSalary());
		emp.setAge(22);
		System.out.println(emp.getAge());
		
	}

}
