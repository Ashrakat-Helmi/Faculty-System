package fucalty;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int id;
	private int age;
	public Person(String firstName, String lastName,int id,int age) {
		this.firstName=firstName;
		this.lastName=lastName;
		setId(id);
		setAge(age);
	}
	//set first name.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} //end method setFirstName.
		
	//return first name(get).
	public String getFirstName() {
		return firstName;
	} // end method getFirstName.
		
	//set last name.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	} //end method setlastName.
			
	//return last name(get).
	public String getLastName() {
		return lastName;
	} // end method getLastName.
		
	//set id.
	public void setId(int id) {
		if(id>0) 
			this.id=id;
		else
			throw new IllegalArgumentException("Your Id aren't correct, Please enter vaild ID. ");	
	} //end method setID.
		
	//return id(get)
	public int getId() {
		return id;
	} // end method getId.
	
	//set age.
	public void setAge(int age) {
		if(age>=18) 
			this.age=age;
		else
			throw new IllegalArgumentException("Your age must be more than 18 , Please enter vaild Age.");	
	} //end method setAge.
			
	//return age(get)
	public int getAge() {
		return age;
	} // end method getAge.
	
	//print String representation of Person object.
	@Override
	public String toString() {
		return String.format("Person Name: %s %s .\nPerson ID: (%s)\nPerson Age: %s.\n",getFirstName(), getLastName(), getId(),  getAge());
	}//end override method toString.

}
