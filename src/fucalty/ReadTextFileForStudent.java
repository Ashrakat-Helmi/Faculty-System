package fucalty;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadTextFileForStudent implements ReadTextFile{

	private Scanner input;
	
	//enable user to open file
	public void openFile() {
		try {
			input = new Scanner(new File("Student.txt"));
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//read record from file
	public void readRecords() {
		Student student = new Student();
		System.out.printf("%-10s%-12s%-12s%10s%10s%10s\n", "Id","firstName","lastName","Age","Level","GPA");
		
		try {
			while(input.hasNext()) {
				student.setId(input.nextInt());
				student.setFirstName(input.next());
				student.setLastName(input.next());
				student.setAge(input.nextInt());
				student.setLevel(input.nextInt());
				student.setGPA(input.nextDouble());
				
				//display record contents
				System.out.printf("%-10d%-12s%-12s%10d%10d%10.2f\n",student.getId(),student.getFirstName(),student.getLastName(),student.getAge(),student.getLevel(),student.getGPA());
				
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
}// end class
