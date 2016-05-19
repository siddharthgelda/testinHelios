package spittr;


//@Entity
public class person {
	
	//@Id
    //@GeneratedValue
	private Long id;
	String usewrname;
	String password;
	String firstName;
	String lastName;
	public person()
	{
		super();
	}
	
	public person(Long id, String usewrname, String password, String firstName, String lastName) {
		super();
		this.id = id;
		this.usewrname = usewrname;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsewrname() {
		return usewrname;
	}
	public void setUsewrname(String usewrname) {
		this.usewrname = usewrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "person [id=" + id + ", usewrname=" + usewrname + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	

}
