package team;

public class EncapsulationDemo {
	
	private String name;
	private int age;
	private String department;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public void setDepartment (String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
}
