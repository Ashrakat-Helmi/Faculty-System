package fucalty;
//Employee abstract superClass.
public  class Employee extends Person{
	private double salary;

	//four-argument constructor.
	public Employee(String firstName ,String lastName,int id ,int age,double salary) {
	super(firstName , lastName,id ,age);
		setSalary(salary); // validate
	} //end four-argument Employee constructor.
	
	//set salary.
	public void setSalary(double salary) {
		if(salary>0.0) 
			this.salary=salary;
		else
			throw new IllegalArgumentException("salary must be >= 0.0. ");	
	} //end method setSalary.
		
	//return salary(get)
	public double getSalary() {
		return salary;
	} // end method getSalary.
	    
}
