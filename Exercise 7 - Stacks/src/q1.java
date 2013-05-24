import java.util.Scanner;
import java.util.Stack;
public class q1 {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f;
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();
		boolean willContinue;
		String x;
		int size;
		Fraction temp = new Fraction();
		do {
			f=new Fraction();//refers to same object otherwise...odd.
			System.out.println("Enter a numerator: ");
			f.num = in.nextInt();
			System.out.println("Enter a denominator:");
			f.den = in.nextInt();
			s.push(f);
			System.out.println("Press 'y' to continue.");
			x = in.next();
			if (x.equals("y"))
				willContinue = true;
			else
				willContinue = false;
		} while (willContinue == true);
		size = s.size();
		for (int i = 0; i<size;i++) {
			temp = (Fraction)s.pop();
			System.out.println(temp.num);
			System.out.println(temp.den);
		}
		
			
		
		

	}

}
