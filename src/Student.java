import java.text.ParseException;

public class Student extends Person {
	// attributes
	private String department;
	private String cgpa;
	private String credit;

	// constructors
	Student() {
		super();
	}

	Student(String name, String id, String age, String address, String gmail, String birthDate, String gender, String phoneNumber,
			String department, String cgpa, String credit) throws ParseException {

		super(name, id, age, address, gender, phoneNumber, gmail, birthDate);
		this.department = department.toUpperCase();
		this.cgpa = cgpa;
		this.credit = credit;
	}

	// getters and setters
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = (department.trim()).toUpperCase();
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa.trim();
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit.trim();
	}

	// method returns data as a string that is writable in file
	@Override
	public String getDataInFileFormate() {
		return super.getName() + "\r\n" + super.getId() + "\r\n" + super.getAge()+ "\r\n" + super.getAddress() + "\r\n" + super.getGmail() + "\r\n"
				+ super.getDateOfBirth() + "\r\n" + super.getGender() + "\r\n" + super.getPhoneNumber() + "\r\n" + department
				+ "\r\n" + cgpa + "\r\n" + credit;
	}

	// toString method
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
				   "\nDepartment       : " +this.getDepartment()+
				   "\nC.G.P.A          : " +this.getCgpa()+
				   "\nCredit           : " +this.getCredit();
	}
}
