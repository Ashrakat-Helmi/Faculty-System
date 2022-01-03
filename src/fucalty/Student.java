package fucalty;

public class Student extends Person {
	
	private int level;
	private double GPA;
	
	public Student() {
		this("","",1,18,1,0.0);
	}
	//five-argument constructor.
	public Student(String firstName,String lastName,int id,int age ,int level,double GPA) {
		// TODO Auto-generated constructor stub
		super(firstName,lastName,id,age);
		setLevel(level);
		setGPA(GPA);
	}
	
	
	//set level.
	public void setLevel(int level) {
		if(level>0 && level<5) 
			this.level=level;
		else
			throw new IllegalArgumentException(" enter vaild level ! your level must be between 1 and 4.");	
	} //end method setLevel.
				
	//return level(get)
		public int getLevel() {
			return level;
	} // end method getLevel.
	
	//set GPA.
	public void setGPA(double GPA) {
		if(GPA>=0.0 && GPA<=4.0) 
			this.GPA=GPA;
		else
			throw new IllegalArgumentException("Your GPA must be >0.0 and <4.0! Please enter vaild GPA. ");	
	} //end method setGPA.
				
	//return GPA(get)
	public double getGPA() {
		return GPA;
	} // end method getGPA.
	
	//print String representation of Student object.
	@Override
	public String toString() {
		return String.format("StudentName: %s %s .\nStudentID: (%s)\nStudentAge: %s.\nStudentLevel: %s.\nstudentGPA: %.2f\n",getFirstName(),getLastName(),getId(),getAge(), getLevel(), getGPA() );
	}//end override method toString.

}
