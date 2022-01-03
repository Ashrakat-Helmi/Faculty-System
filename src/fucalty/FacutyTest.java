package fucalty;

import java.util.*;

public class FacutyTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.printf("%s\n%s\n%s\n", "Welcome in FCI Assuit.", "If you want to dispaly all information about Students , Instructors ,..etc Enter 1.","If you want to add new Student , Instructor,..etc Enter 2");
		
	int number = input.nextInt();
	if(number == 1) {
		System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n", "For display all:  Enter:","Students 1","Instrutors 2", "Administrators 3", "Technicions 4", "Workers 5");
		int number2 = input.nextInt();
		switch(number2) {
		case 1:
			    ReadTextFileForStudent app1 = new ReadTextFileForStudent();
				app1.openFile();
				app1.readRecords();
				app1.closeFile();
				break;
		case 2:	
				ReadTextFileForInstructor app2 = new ReadTextFileForInstructor();
				app2.openFile();
				app2.readRecords();
				app2.closeFile();
				break;
		case 3:
				ReadTextFileForAdministrator app3 = new ReadTextFileForAdministrator();
				app3.openFile();
				app3.readRecords();
				app3.closeFile();
				break;
		case 4:
				ReadTextFileForTechnician app4 = new ReadTextFileForTechnician();
				app4.openFile();
				app4.readRecords();
				app4.closeFile();	
				break;
		case 5:
				ReadTextFileForWorker app5 = new ReadTextFileForWorker();
				app5.openFile();
				app5.readRecords();
				app5.closeFile();
				break;
		default:
			System.out.print("Enter a vaild number!");
			break;
		} // end switch

	}else if(number ==2) {
		System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n", "For add to file:  Enter:","Students 1","Instrutors 2", "Administrators 3", "Technicions 4", "Workers 5");
		int number2 = input.nextInt();
		switch(number2) {
		case 1:
			CreateTextFileForStudent app1 = new CreateTextFileForStudent();
			app1.openfile();
			app1.addRecords();
			app1.closeFile();
			break;
		case 2:	
			CreateTextFileForInstructor app2= new CreateTextFileForInstructor();
			app2.openfile();
			app2.addRecords();
			app2.closeFile();
			break;
		case 3:
			CreateTextFileForAdministrator app3 =new CreateTextFileForAdministrator();
			app3.openfile();
			app3.addRecords();
			app3.closeFile();
			break;
		case 4:
			CreateTextFileForTechnician app4 =new CreateTextFileForTechnician();
			app4.openfile();
			app4.addRecords();
			app4.closeFile();
			break;
		case 5:
			CreateTextFileForWorker app5 = new CreateTextFileForWorker();
			app5.openfile();
			app5.addRecords();
			app5.closeFile();
			break;
		default:
			System.out.print("Enter a vaild number!");
			break;
		} // end switch

	}//end if


	}

}
