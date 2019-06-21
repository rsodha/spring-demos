package spring.core.basics;

public class Employee {
	private String id;

	public Employee() {
	}

	public Employee(String id) {
		this.id = id;
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
