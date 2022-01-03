package fucalty;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadTextFileForAdministrator implements ReadTextFile{
 private Scanner input;
	
	//enable user to open file
	public void openFile() {
		try {
			input = new Scanner(new File("Administrator.txt"));
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//read record from file
	public void readRecords() {
		Administrator administrator = new Administrator();
		System.out.printf("%-10s%-12s%-12s%10s%10s%10s\n", "Id","firstName","lastName","Age","Salary","Position");
		
		try {
			while(input.hasNext()) {
				administrator.setId(input.nextInt());
				administrator.setFirstName(input.next());
				administrator.setLastName(input.next());
				administrator.setAge(input.nextInt());
				administrator.setSalary(input.nextDouble());;
				administrator.setPosition(input.next());
				
				//display record contents
				System.out.printf("%-10d%-12s%-12s%10d%10.2f%10s\n",administrator.getId(),administrator.getFirstName(),administrator.getLastName(),administrator.getAge(),administrator.getSalary(),administrator.getPosition());
				
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
