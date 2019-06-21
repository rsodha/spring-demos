package spring.core.basics;

public class Employee {
	private String id;

	public Employee() {
		System.out.println("Employee " + this.id + " constructed");
	}

	public Employee(String id) {
		this.id = id;
		System.out.println("Employee " + this.id + " constructed");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
}
