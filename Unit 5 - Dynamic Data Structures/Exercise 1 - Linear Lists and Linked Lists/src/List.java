
public class List {
	private Fraction head;
	/**
	 * will insert a fraction at the end of the Linked List
	 * @param f
	 */
	public void insertFirst(Fraction f) {
		head = f;
	}
	
	/**
	 * will insert a second fraction at the end of the Linked List
	 * @param f
	 */
	public void insertSecond(Fraction f) {
		head.link = f;
	}
	
	/**
	 * will insert a third fraction at the end of the Linked List
	 * @param f
	 */
	public void insertThird(Fraction f) {
		head.link.link = f;
	}
	
	/**
	 * will insert a fraction at the end of the linked list
	 * @param f
	 */
	public void addatEnd(Fraction f) {
		Fraction temp = head;
		while (temp.link!=null){
			temp = temp.link;
		}
		temp.link = f;
	}
	
	/**
	 * insert a fraction (1,1) at the beginning of the Linked List
	 */
	public void addatFront() {
		head = new Fraction(head, 1, 1);
	}
	
	/**
	insert a 
	fraction (n,d)  at the beginning of the Linked List
	*/
	public void addatFront(int n, int d) {
		head = new Fraction(head, n, d);
	}
	
	/**
	 * returns a value of true if the list of students is empty. Otherwise, it returns false
	 * @return
	 */
	public boolean emptyList() {
		if (head==null) {
			return true;
		}
		else 
			return false;
	}
	
	/**
	 * print the fractions contained in the list. 
	 * @author Clement
	 */
	public void printList() {
		for (Fraction temp = head;temp!=null;temp = temp.link) {
			System.out.println("num: "+temp.num);
			System.out.println("def: "+temp.den);
		}
	}
	
	/**
	 * traverses through the linked list and prints the xth fraction
	 * @author Clement
	 */
	public void printFraction(int x) {
		Fraction temp = head;
		for (int i = 0;i<x;i++){
			temp = temp.link;
		}
		System.out.println("num: "+temp.num);
		System.out.println("def: "+temp.den);
	}
	
	
	
	class Fraction {
		int num;
		int den;
		Fraction link;
		
		Fraction() {
			num = 1;
			den = 1;
			link = null;
		}
		
		Fraction(Fraction f, int n, int d) {
			this.num = n;
			this.den = d;
			link = f;
		}
		
	}
	
}
