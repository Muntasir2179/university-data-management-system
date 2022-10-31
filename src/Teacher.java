import java.text.ParseException;

public class Teacher extends Person {
	// attributes
	private String designation;
	private String salary;
	private String courseTeaches;

	// constructors
	Teacher() {

	}

	Teacher(String name, String id,String age, String address, String gender, String phoneNumber, String gmail, String birthDate,
			String designation, String salary, String courseTeaches) throws ParseException {
		super(name, id, age, address, gender, phoneNumber, gmail, birthDate);
		this.designation = designation.trim();
		this.salary = salary.trim();
		this.courseTeaches = courseTeaches.trim();
	}

	// getters and setters
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation.trim();
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary.trim();
	}

	public String getCourseTeaches() {
		return courseTeaches;
	}

	public void setCourseTeaches(String courseTeaches) {
		this.courseTeaches = courseTeaches.trim();
	}

	// method returns data as a string that is writable in file
	@Override
	public String getDataInFileFormate() {
		return super.getName() + "\r\n" + super.getId() + "\r\n" + super.getAge() + "\r\n" + super.getAddress() + "\r\n" + super.getGender() 
			+ "\r\n" + super.getPhoneNumber() + "\r\n" + super.getGmail() + "\r\n" + super.getDateOfBirth() + "\r\n" + designation
			+ "\r\n" + salary + "\r\n" + courseTeaches;
	}

	// toString() method
	@Override
	public String toString() {
		return "Name             : " +super.getName()+
			   "\nID               : " +super.getId()+
			   "\nAge              : " +super.getAge()+
			   "\nAddress          : " +super.getAddress()+
			   "\nGander           : " +super.getGender()+
			   "\nDate of Birth    : " +super.getBirthDate()+
			   "\nPhone Number     : " +super.getPhoneNumber()+
			   "\nEmail            : " +super.getGmail()+
			   "\nDesignation      : " +this.getDesignation()+
			   "\nSalary           : " +this.getSalary()+
			   "\nTeaching subject : " +this.getCourseTeaches();
	}
}
