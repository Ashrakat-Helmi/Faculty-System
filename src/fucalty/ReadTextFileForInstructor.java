package fucalty;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadTextFileForInstructor implements ReadTextFile{
	private Scanner input;
	
	//enable user to open file
	public void openFile() {
		try {
			input = new Scanner(new File("Instructor.txt"));
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//read record from file
	public void readRecords() {
		Instructor instructor = new Instructor();
		System.out.printf("%-10s%-12s%-12s%10s%9s%15s%10s\n", "Id","firstName","lastName","Age","Salary","Department","Course");
		
		try {
			while(input.hasNext()) {
				instructor.setId(input.nextInt());
				instructor.setFirstName(input.next());
				instructor.setLastName(input.next());
				instructor.setAge(input.nextInt());
				instructor.setSalary(input.nextDouble());
				instructor.setDepartment(input.next());
				instructor.setCourse(input.next());
				
				//display record contents
				System.out.printf("%-10d%-12s%-12s%10d%10.2f%8s%17s\n",instructor.getId(),instructor.getFirstName(),instructor.getLastName(),instructor.getAge(),instructor.getSalary(),instructor.getDepartment(),instructor.getCourse());
				
			}//end while
		}catch(NoSuchElementException elementException) {
			System.err.println( "File improperly formed." );
			input.close();
			System.exit(1);
		}catch( IllegalStateException stateException) {
			System.err.println( "Error reading from file." );
			System.exit(1);
		}//end try catch
	}//end method readRecords
	
	//close file and terminate application
	public void closeFile() {
		if(input != null)
			input.close();
	}// end method closeFile
}
