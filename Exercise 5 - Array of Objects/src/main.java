import java.util.Scanner;


public class main {

  public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int num;
		String tempID;

		
		boolean menuRunning = true;
		int menuOption;
		
		int sum = 0; //used in calculating average
		
		do {
			System.out.println("Enter number of students: ");
			num = in.nextInt();
		} while (num < 0);
		
		student[] s = new student[num];
		for (int i = 0; i < s.length; i++) 
			s[i] = new student();
		
		for (int i = 0;i<s.length;i++) {
			System.out.println("Enter last name of student "+(i+1)+": ");
			s[i].setLast_name(in.next());
		
			do{
				System.out.println("Enter age of student "+(i+1)+": ");
			} while (s[i].setAge(in.nextInt())==false);
			
			do {
				System.out.println("Enter student ID of student "+(i+1)+": ");
			} while (s[i].setStudentNum(in.next())==false);
			
			do {
				System.out.println("Enter student average of student "+(i+1)+": ");
			} while (s[i].setAvg(in.nextDouble())==false);	
		}
		
		do {
			System.out.println("1 - Edit student");
			System.out.println("2 - Print average of all students");
			System.out.println("3 - Print list of students");
			System.out.println("4 - Exit program");
			System.out.println("Select an option: ");
			menuOption = in.nextInt();
			
			if (menuOption == 1) {
				boolean temp = false;
				do {
					System.out.println("Enter a student number:");
					tempID = in.next();
					for (int i = 0; i<s.length;i++) {
						if (tempID.equals(s[i].getStudentNum())) {
							System.out.println("Student found!");
							temp = true;
							System.out.println("Enter a new average: ");
							s[i].setAvg(in.nextDouble());
							System.out.println("Enter a new age: ");
							s[i].setAge(in.nextInt());
						}
					}
					if (temp = false)
						System.out.println("Incorrect ID.");
				} while(temp==false);
			}
			
			else if (menuOption == 2) {
				sum = 0;
				for (int i = 0; i<s.length;i++) {
					System.out.println(s[i].getLast_name()+"'s average: "+s[i].getAvg());
					sum += 1;
				}
				System.out.println("Class average: "+sum/s.length);	
			}
			
			else if (menuOption == 3) {
				for (int i = 0; i<s.length;i++)
					System.out.println(s[i].getLast_name());
			}
			
			else if (menuOption == 4) {
				menuRunning = false;
			}
	
			else 
				System.out.println("Invalid option selected.");
		} while(menuRunning);
		
	}

}
