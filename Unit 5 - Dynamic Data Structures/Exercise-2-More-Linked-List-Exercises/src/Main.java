import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
  	int tempNum, tempDen;
		Scanner in = new Scanner(System.in);
		int option;
		System.out.println("Select a question (4,5,6,7): ");
		option = in.nextInt();
		if (option == 4) {
			List q4 = new List();
			
			System.out.println("Enter num: ");
			tempNum = in.nextInt();
			System.out.println("Enter den: ");
			tempDen = in.nextInt();
			List.Fraction f = q4.new Fraction(null, tempNum, tempDen);
			q4.insertFirst(f);
			
			System.out.println("Enter num: ");
			tempNum = in.nextInt();
			System.out.println("Enter den: ");
			tempDen = in.nextInt();
			f = q4.new Fraction(null, tempNum, tempDen);
			q4.insertSecond(f);
			
			System.out.println("Enter num: ");
			tempNum = in.nextInt();
			System.out.println("Enter den: ");
			tempDen = in.nextInt();
			f = q4.new Fraction(null, tempNum, tempDen);
			q4.insertThird(f);
		}
		else if (option == 5) {
			boolean continuePrompt;
			String temp;
			List q5 = new List();
			do {
				System.out.println("Enter num: ");
				tempNum = in.nextInt();
				System.out.println("Enter den: ");
				tempDen = in.nextInt();
				q5.addatFront(tempNum,tempDen);
				q5.printList();
				
				System.out.println("Continue?(y/n)");
				temp = in.next();
				if (temp.equals("y"))
					continuePrompt = true;
				else
					continuePrompt = false;
			} while(continuePrompt);
		}
		else if (option == 6) {
			System.out.println("Too lazy to do this question.");
		}
		else if (option == 7) {
			boolean continuePrompt;
			String temp;
			List q7 = new List();
			do {
				System.out.println("Enter num: ");
				tempNum = in.nextInt();
				System.out.println("Enter den: ");
				tempDen = in.nextInt();
				q7.addatFront(tempNum,tempDen);

				System.out.println("Continue?(y/n)");
				temp = in.next();
				if (temp.equals("y"))
					continuePrompt = true;
				else
					continuePrompt = false;
			} while(continuePrompt);
			q7.Sort();
			q7.printList();
		}
		else
			System.out.println("Not a valid question.");
	}
}
