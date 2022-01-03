package fucalty;

public class Instructor extends Employee{
	private String department;
	private String course;

	public Instructor() {
		this("","",1,18,1,"","");
	}
	//seven-argument constructor.
	public Instructor(String firstName ,String lastName,int id ,int age,double salary,String department,String course) {
		// TODO Auto-generated constructor stub
		super(firstName , lastName, id ,age,salary);
		this.department =department;
		this.course =course;
	}
	
	//set department.
	public void setDepartment(String department) {
		this.department =department;
	}// end method setDepartment.
	
	// return department(get)
	public String getDepartment() {
		return  department;
	} //end method getDepartment.
	
	//set course.
	public void setCourse(String course) {
		this.course =course;
	}// end method setCourse.
		
	// return course(get)
	public String getCourse() {
		return  course;
	} //end method getCourse.
		
	//print String representation of Employee object.
	@Override
	public String toString() {
		return String.format("InstructorName: %s %s .\nInstructorID: (%s).\nAge: %s\nSalary: %s.\nInstructorDepartment: %s.\nInstructorCourse: %s.\n",getFirstName(),getLastName(),getId(),getAge(),getSalary(),getDepartment(),getCourse());
	}//end override method toString.

}
