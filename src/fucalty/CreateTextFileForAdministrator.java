package fucalty;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateTextFileForAdministrator implements CreateTextFile {
	private Formatter output;
	
	Administrator administrator = new Administrator();
	ArrayList<Administrator> administratorArrLst = new ArrayList<Administrator>();
	
	//allow user to open file name.
	public void openfile() {
		try {
			output = new Formatter("Administrator.txt");			
		}catch(SecurityException securityException){
			System.err.println("You do not have write access to this file!");
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening or creating file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//add records to file.
	public void addRecords() {
		Administrator administrator= new Administrator();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			
		System.out.printf( "%s\n%s\n%s\n%s\n\n","To terminate input, type the end-of-file indicator ","when you are prompted to enter input.","On UNIX/Linux/Mac OS X type <ctrl> d then press Enter","On Windows type <ctrl> z then press Enter" );
			
		System.out.printf( "%s\n%s","Enter Administrator Id (> 0), first name, last name , Age , Salary , position.", "? " );
		
		while(input.hasNext()) {
			try {
				administrator.setId(input.nextInt());
				administrator.setFirstName(input.next());
				administrator.setLastName(input.next());
				administrator.setAge(input.nextInt());
				administrator.setSalary(input.nextDouble());
				administrator.setPosition(input.next());
				administratorArrLst.add(administrator);
				if(administrator.getId()>0) {
					output.format("%d %s %s %d %.2f %s\n",administrator.getId(),administrator.getFirstName(),administrator.getLastName(),administrator.getAge(),administrator.getSalary(),administrator.getPosition());
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
				
			System.out.printf( "%s\n%s","Enter Administrator Id (> 0), first name, last name , Age , Salary , position.", "? " );

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
