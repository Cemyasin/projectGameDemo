package entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private long nationalityId;
	private double birthDay;
	
	public Customer(int id, String firstName, String lastName,long nationalityId,double birthDay) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.nationalityId=nationalityId;
		this.birthDay=birthDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public double getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(double birthDay) {
		this.birthDay = birthDay;
	}

}
