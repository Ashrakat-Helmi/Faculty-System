package fucalty;

public class Technician extends Employee{
	private int numberOfDevicesFixed;
	
	public Technician() {
		this("","",1,18,2000,1);
	}
	public Technician(String firstName ,String lastName,int id ,int age,double salary,int numberOfDevicesFixed) {
		// TODO Auto-generated constructor stub
		super( firstName , lastName,id ,age, salary);
		 setNumberOfDevicesFixed(numberOfDevicesFixed) ;
	}
	
	//set numberOfDevicesFixed.
	public void setNumberOfDevicesFixed(int numberOfDevicesFixed) {
		if(numberOfDevicesFixed >0) 
			this.numberOfDevicesFixed=numberOfDevicesFixed;
		else
			throw new IllegalArgumentException("Your Number Of Devices Fixed must be >0. ");	
	}//end method setNumberOfDevicesFixed.
	
	//return setNumberOfDevicesFixed.
	public int getNumberOfDevicesFixed() {
		return numberOfDevicesFixed;
	}// end method setNumberOfDevicesFixed.
	
	//print String representation of Technician object.
	@Override
	public String toString() {
		return String.format("TechnicianName: %s %s .\nTechnicianID: (%s)\nTechnicianAge: %s.\nTechnicianSalary: %s .\nNumber Of Devices The Technician Fixed: %s.\n",getFirstName(),getLastName(),getId(),getAge(), getSalary(),getNumberOfDevicesFixed() );
	}//end override method toString.

}
