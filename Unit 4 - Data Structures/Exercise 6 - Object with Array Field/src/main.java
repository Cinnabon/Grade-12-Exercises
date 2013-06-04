import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int temp;
		
		//variables for use in menu
		boolean menuRunning = true;
		int option; 
		String num;
		int x;
		student toAdd;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a classroom size: ");
		
		temp = in.nextInt();
		classroom c = new classroom(temp);
		
		//prompts user for student data
		for (int i = 0; i <temp;i++) {
			System.out.println("Enter student "+(i+1)+"'s last name: ");
			c.getStudent(i).setLastname(in.next());
			
			do{
				System.out.println("Enter student "+(i+1)+"'s age: ");
			} while (c.getStudent(i).setAge(in.nextInt())==false);
			
			do{
				System.out.println("Enter student "+(i+1)+"'s student number: ");
			} while (c.getStudent(i).setStudentNum(in.next())==false);
			
			for (int j = 0; j<c.getStudent(0).getMark().length; j++) {
				do {
				System.out.println("Enter mark "+(j+1)+": ");
				} while (c.getStudent(i).setMark(j, in.nextDouble())==false);
			}
			c.getStudent(i).calculateAverage();
		}
		c.average();
		
		do {
			//provide user with options
			do {
				System.out.println("1 - Edit student.");
				System.out.println("2 - Add student");
				System.out.println("3 - Print class average");
				System.out.println("4 - Print list of students");
				System.out.println("5 - Terminate program");
				System.out.println("Select an option: ");
				option = in.nextInt();
			} while (option > 5 || option < 1);
			
			if (option == 1) {
				x=-1;
				do {//locates student
					System.out.println("Enter Student Number: ");
					num = in.next();
					for (int i = 0; i < temp; i++) {
						if (c.getStudent(i).getStudentNum().equals(num)) 
							x = i; //sets index 
					}
				} while (x==-1);
				
				System.out.println("Enter student's last name: ");
				c.getStudent(x).setLastname(in.next());
				
				do{
					System.out.println("Enter student's age: ");
				} while (c.getStudent(x).setAge(in.nextInt())==false);
				
				do{
					System.out.println("Enter student number: ");
				} while (c.getStudent(x).setStudentNum(in.next())==false);
				
				for (int i = 0; i<c.getStudent(x).getMark().length; i++) {
					do {
						System.out.println("Enter mark "+(i+1)+": ");
					} while (c.getStudent(x).setMark(i, in.nextDouble())==false);
				}
				c.getStudent(x).calculateAverage();
				c.average();
			}
			
			else if (option == 2) {
				toAdd = new student();
				System.out.println("Enter student's last name: ");
				toAdd.setLastname(in.next());
				
				do{
					System.out.println("Enter student's age: ");
				} while (toAdd.setAge(in.nextInt())==false);
				
				do{
					System.out.println("Enter student's student number: ");
				} while (toAdd.setStudentNum(in.next())==false);
				
				for (int i = 0; i<c.getStudent(0).getMark().length; i++) {
					do {
						System.out.println("Enter mark "+(i+1)+": ");
					} while (toAdd.setMark(i, in.nextDouble())==false);
				}
				toAdd.calculateAverage();
				c.insertStudent(toAdd);
				c.average();
			}
			
			else if (option == 3) {
				c.average();//calculates average one last time
				System.out.println("Class average: "+c.getClassAvg());
			}
			
			else if (option == 4) {
				c.printStudents();
			}
			
			else if (option == 5)
				menuRunning = false;
		} while (menuRunning == true);
		
	}

}
