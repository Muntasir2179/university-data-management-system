import java.text.ParseException;

public class Stuff extends Person {
	// attributes
	private String designation;
	private String salary;

	// constructors
	Stuff() {
	}

	Stuff(String name, String id, String age,String address, String gender, String phoneNumber, String gmail, String birthDate,
			String designation, String salary) throws ParseException {
		super(name, id, age, address, gender, phoneNumber, gmail, birthDate);
		this.designation = designation.trim();
		this.salary = salary.trim();
	}

	// getters and setters
	public String getDesignation() {
		return designation;
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

	// inherited abstract method
	@Override
	public String getDataInFileFormate() {
		return this.getName() + "\r\n" + this.getId() + "\r\n" + this.getAge() + "\r\n" + this.getAddress() + "\r\n" + this.getGender() + "\r\n"
				+ this.getPhoneNumber() + "\r\n" + this.getGmail() + "\r\n" + this.getDateOfBirth() + "\r\n"+ this.getDesignation() + 
				"\r\n" + this.getSalary();
	}

	// toString method
	@Override
	public String toString() {
		return "Name          : " + this.getName() + 
			 "\nID            : " + this.getId() + 
			 "\nAge           : " + this.getAge() +
			 "\nAdderss       : " + this.getAddress() +
			 "\nGender        : " + this.getGender() + 
			 "\nPhone number  : " + this.getPhoneNumber() +
			 "\nGmail         : " + this.getGmail() + 
			 "\nDate of Birth : " + this.getBirthDate() + 
			 "\nDesignation   : " + this.getDesignation() + 
			 "\nSalary        : " + this.getSalary();
	}
}
