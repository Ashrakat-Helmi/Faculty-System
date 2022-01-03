package fucalty;

public class Administrator extends Employee{
	private String position;
	public Administrator() {
		this("","",1,18,2000,"");
	}
	
	public Administrator(String firstName ,String lastName,int id ,int age,double salary,String position) {
		// TODO Auto-generated constructor stub
		super(firstName ,lastName,id ,age,salary);
		this.position =position;
	}
	
	//set last position.
	public void setPosition(String position) {
		this.position = position;
	} //end method setPosition.
			
	//return position(get).
	public String getPosition() {
		return position;
	} // end method getPosition.
	
	//print String representation of Administrator object.
	@Override
	public String toString() {
		return String.format("AdministratorName: %s %s .\nAdministratorID: (%s)\nAdministratorAge: %s.\nAdministrator Salary: %s .\nPosition: %s.\n",getFirstName(),getLastName(),getId(),getAge(), getSalary(),getPosition() );
	}//end override method toString.
}
