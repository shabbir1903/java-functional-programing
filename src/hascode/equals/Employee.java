package hascode.equals;

public class Employee {

	private String name;
	private int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		return this.name.length() % 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Employee other = (Employee) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}

}
