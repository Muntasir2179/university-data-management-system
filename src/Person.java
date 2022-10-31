import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
	// attributes
	private String name;
	private String id;
	private String age;
	private String address;
	private String gender;
	private String phoneNumber;
	private String gmail;
	private String birthDate;
	private Date dateOfBirth;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	// constructors
	// inbuilt trim() method removes leading and trailing spaces from a string
	Person() {

	}

	public Person(String name, String id, String age, String address, String gender, String phoneNumber, String gmail,
			String birthDate) throws ParseException {
		super();
		this.name = name.trim();
		this.id = id.trim();
		this.age = age.trim();
		this.address = address.trim();
		this.gender = gender.trim();
		this.phoneNumber = phoneNumber.trim();
		this.gmail = gmail.trim();
		this.birthDate = birthDate.trim();
		this.dateOfBirth = dateFormat.parse(birthDate);
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id.trim();
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age.trim();
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender.trim();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber.trim();
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail.trim();
	}

	public String getBirthDate() {
		return birthDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setBirthDate(String birthDate) throws ParseException {
		this.birthDate = birthDate.trim();
		this.dateOfBirth = dateFormat.parse(birthDate);
	}

	// abstract method
	public abstract String getDataInFileFormate();

	// toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id +", age=" + age  + ", address=" + address + "gender=" + gender + "phoneNumber="
				+ phoneNumber + "gmail=" + gmail + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
