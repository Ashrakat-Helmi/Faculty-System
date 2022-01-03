package fucalty;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateTextFileForTechnician implements CreateTextFile{

private Formatter output;
Technician technician = new Technician();
ArrayList<Technician> technicianArrLst = new ArrayList<Technician>();
	//allow user to open file name.
	public void openfile() {
		try {
			output = new Formatter("Technician.txt");			
		}catch(SecurityException securityException){
			System.err.println("You do not have write access to this file!");
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening or creating file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//add records to file.
	public void addRecords() {
		Technician technician= new Technician();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			
		System.out.printf( "%s\n%s\n%s\n%s\n\n","To terminate input, type the end-of-file indicator ","when you are prompted to enter input.","On UNIX/Linux/Mac OS X type <ctrl> d then press Enter","On Windows type <ctrl> z then press Enter" );
			
		System.out.printf( "%s\n%s","Enter Technician Id (> 0), first name, last name , Age , Salary ,Number of devices fixed.", "? " );
		while(input.hasNext()) {
			try {
				technician.setId(input.nextInt());
				technician.setFirstName(input.next());
				technician.setLastName(input.next());
				technician.setAge(input.nextInt());
				technician.setSalary(input.nextDouble());
				technician.setNumberOfDevicesFixed(input.nextInt());
				technicianArrLst.add(technician);
				if(technician.getId()>0) {
					output.format("%s %s %s %s %s %s\n",technician.getId(),technician.getFirstName(),technician.getLastName(),technician.getAge(),technician.getSalary(),technician.getNumberOfDevicesFixed());
				}else {
					System.out.println("id must be greater than zero");
						
				}
			}catch (FormatterClosedException formatterClosedException){
				System.err.println("Error Writing to file!");
				return;
			}catch(NoSuchElementException elementException) {
				System.err.println( "Invalid input. Please try again." );
				input.nextLine();
			}//end try catch.
				
			System.out.printf( "%s\n%s","Enter Technician Id (> 0), first name, last name , Age , Salary ,Number of devices fixed.", "? " );

		}//end while loop
				
	}//end method addRecords
	
	//close file and terminate application.
		public void closeFile() {
			if(output != null) {
				output.close();
				System.out.print("process done successfully");
			}
		}//end method closeFile.
}
