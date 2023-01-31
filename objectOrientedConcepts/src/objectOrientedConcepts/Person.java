package objectOrientedConcepts;

public abstract class Person {
	
	private String name;
	private String surname;
	private String telphone;
	private String email;
	private String password;
	
	public Person(String name, String surname, Phone telphone,String email, String password )
	{
		super();
		this.name = name;
		this.surname = surname;
		this.telphone = telphone;
		this.email = email;
		this.password = password;
	}
	
	public String setName(String name)
	{
		this.name = name;
	}
	
	public void getName()
	{
		return name;
	}
	
	public void getSurName()
	{
		return surName;
	}
	
	public String setSurName(Sting surName)
	{
		this.surname = surName;
	}
	
	public Phone getTelPhone()
	{
		return telphone;
	}
	
	pubic void setTelphone(Phone telphone)
	{
		this.telphone = telphone;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	abstract public Book searchBook(String bookName);
	abstract public Book searchBookByAuthor(String authorName);
	
	
}
