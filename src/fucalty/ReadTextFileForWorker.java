package fucalty;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadTextFileForWorker implements ReadTextFile{
	private Scanner input;
	
	//enable user to open file
	public void openFile() {
		try {
			input = new Scanner(new File("Worker.txt"));
		}catch(FileNotFoundException fileNotFoundException) {
			System.err.println( "Error opening file." );
			System.exit(1);
		}//end try catch.
	}//end method openFile.
	
	//read record from file
	public void readRecords() {
		Worker worker = new Worker();
		System.out.printf("%-10s%-12s%-12s%10s%10s%10s\n", "Id","firstName","lastName","Age","Salary","DaysOfWorkPerMonth");
		
		try {
			while(input.hasNext()) {
				worker.setId(input.nextInt());
				worker.setFirstName(input.next());
				worker.setLastName(input.next());
				worker.setAge(input.nextInt());
				worker.setSalary(input.nextDouble());
				worker.setDaysOfWorkPerWeek(input.nextInt());
				
				//display record contents
				System.out.printf("%-10d%-12s%-12s%10d%10.2f%10d\n",worker.getId(),worker.getFirstName(),worker.getLastName(),worker.getAge(),worker.getSalary(),worker.getDaysOfWorkPerMonth());
				
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
