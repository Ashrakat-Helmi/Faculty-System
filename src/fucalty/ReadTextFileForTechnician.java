package fucalty;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadTextFileForTechnician implements ReadTextFile{
	private Scanner input;
	
	//enable user to open file
	public void openFile() {
		try {
			input = new Scanner(new File("Technician.txt"));
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//read record from file
	public void readRecords() {
		Technician technician = new Technician();
		System.out.printf("%-10s%-12s%-12s%10s%9s%10s\n", "Id","firstName","lastName","Age","Salary","NumberOfDevicesFixed");
		
		try {
			while(input.hasNext()) {
				technician.setId(input.nextInt());
				technician.setFirstName(input.next());
				technician.setLastName(input.next());
				technician.setAge(input.nextInt());
				technician.setSalary(input.nextDouble());
				technician.setNumberOfDevicesFixed(input.nextInt());
				
				//display record contents
				System.out.printf("%-10d%-12s%-12s%10d%10.2f%15d\n",technician.getId(),technician.getFirstName(),technician.getLastName(),technician.getAge(),technician.getSalary(),technician.getNumberOfDevicesFixed());
				
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
