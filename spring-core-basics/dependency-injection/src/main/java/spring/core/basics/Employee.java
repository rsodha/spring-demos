package spring.core.basics;

public class Employee {
	private String id;
	private Address adrs;

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	public Employee() {
	}

	public Employee(String id) {
		this.id = id;
	}

	public Employee(Address adrs) {
		this.adrs = adrs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", adrs=" + adrs + "]";
	}
}
