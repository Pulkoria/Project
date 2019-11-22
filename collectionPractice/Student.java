package programmes.collectionPractice;

public class Student {
	private int id;
	private String name;
	private String dob;
	private String address;
	private Integer mobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Student(int id, String name, String dob, String address, Integer mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	

}
