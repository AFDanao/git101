public class Organization {

	// Data Members
	private String name;
	private String section;
	private int age;
	private int yearLvl;

	// Method
	public void print() {
		System.out.println("Printing Data...");
	}

	// Constructor
	public Organization(String p_name, String p_section, int p_age, int p_yearLvl) {
		this.name = p_name;
		this.section = p_section;
		this.age = p_age;
		this.yearLvl = p_yearLvl;
	}

	// Public Getters
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSection() {
		return section;
	}

	public int getYearLvl() {
		return yearLvl;
	}

	// Public Setters
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void setYearLvl(int yearLvl) {
		this.yearLvl = yearLvl;
	}
}

class Main {
	public static void main(String[] args) {
		Organization student1 = new Organization("Adrian", "CPE1", 19, 2);
		Organization student2 = new Organization("Mark", "CPE2", 20, 3);
		Organization student3 = new Organization("Bob", "CPE3", 18, 1);

		print(student1.getName(), student1.getSection(), student1.getAge(), student1.getYearLvl());
		print(student2.getName(), student2.getSection(), student2.getAge(), student2.getYearLvl());
		print(student3.getName(), student3.getSection(), student3.getAge(), student3.getYearLvl());
	}

	public static void print(String name, String section, int age, int yearLvl) {
		System.out.println("Name: " + name);
		System.out.println("Section: " + section);
		System.out.println("Age: " + age);
		System.out.println("Year Level: " + yearLvl);
		System.out.println("\n");
	}
}