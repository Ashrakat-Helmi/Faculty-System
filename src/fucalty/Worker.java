package fucalty;

public class Worker extends Employee{
	private int daysOfWorkPerWeek; 
	
	public Worker() {
		this("","",1,18,2000.0,5);
	}
	public Worker( String firstName, String lastName,int id,int age ,Double salary,int daysOfWorkPerWeek) {
		// TODO Auto-generated constructor stub
		super( firstName, lastName, id , age,salary);
		setDaysOfWorkPerWeek(daysOfWorkPerWeek);
	}
	
	//set daysOfWorkPerWeek
	public void setDaysOfWorkPerWeek(int daysOfWorkPerWeek) {
		if(daysOfWorkPerWeek>=3 && daysOfWorkPerWeek<=6) 
			this.daysOfWorkPerWeek=daysOfWorkPerWeek;
		else
			throw new IllegalArgumentException("Your days of work per week must be betwen 3 and 6 days. ");	
	}//end method setDaysOfWorkPerWeek.
	
	//return setDaysOfWorkPerWeek.
	public int getDaysOfWorkPerWeek() {
		return daysOfWorkPerWeek;
	}// end method setDaysOfWorkPerWeek.
	
	//return setDaysOfWorkPerWeek.
	public int getDaysOfWorkPerMonth() {
		return daysOfWorkPerWeek*4;
	}// end method setDaysOfWorkPerMonth.
	
	//print String representation of worker object.
	@Override
	public String toString() {
		return String.format("WorkerName: %s %s .\nWorkerID: (%s)\nWorkerAge: %s.\nWorkerSalary: %s .\nDays Of Work Per Month: %s.\n",getFirstName(),getLastName(),getId(),getAge(),getSalary(), getDaysOfWorkPerMonth() );
	}//end override method toString.
}

