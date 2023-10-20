package ArrayList;

public class Program {

	private String name;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "name=" + name + ", designation=" + designation + ", salary=" + salary + ", CodingLanguage="
				+ CodingLanguage + ", isMale=" + isMale ;
	}
	public Program(String name, String designation, int salary, String codingLanguage, boolean isMale) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		CodingLanguage = codingLanguage;
		this.isMale = isMale;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCodingLanguage() {
		return CodingLanguage;
	}
	public void setCodingLanguage(String codingLanguage) {
		CodingLanguage = codingLanguage;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	private String designation;
	private int salary;
	private String CodingLanguage;
	private boolean isMale;

}
