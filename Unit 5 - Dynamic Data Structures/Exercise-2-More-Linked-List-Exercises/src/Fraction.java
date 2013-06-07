
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
		if (head!=null) {
			Fraction temp = head;
			while (temp.link!=null){
				temp = temp.link;
			}
			temp.link = f;
		}
		else
			head = f;
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
	//for use with sorting
	public void addatFront(Fraction f) {
		head = f;
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
	
	/**
	 *returns num from the xth fraction in the linked list. This method will return -1 if the there is no xth fraction
	 * @author Clement
	 */
	public int getNum(int x) {
		int num = -1;
		Fraction temp = head;
		for (int i = 1;i<x;i++) {
			temp = temp.link;
			if (temp.link==null)
				i=x;
		}
		if (temp!=null)
			num = temp.num;
		return num;
	}
	
	/**
	 * assigns num from the xth fraction in the linked list to n
	 * @author 605920
	 */
	public void putNum(int x, int n) {
		Fraction temp = head;
		for (int i = 1; i<x;i++) {
			temp = temp.link;
		}
		temp.num = n;
	}
	
	/**
	 * This method returns den from the xth fraction in the linked list. 
	 * This method will return -1 if the there is no xth fraction.
	 * @param x
	 * @return
	 */
	public int getDen(int x) {
		int den = -1;
		Fraction temp = head;
		for (int i = 1;i<x;i++) {
			temp = temp.link;
			if (temp.link==null)
				i=x;
		}
		if (temp!=null)
			den = temp.den;
		return den;
	}
	
	/**
	 * This method assigns den from the xth fraction in the linked list to d
	 * @param x
	 * @param d
	 */
	public void putDen(int x, int d) {
		Fraction temp = head;
		for (int i = 1; i<x;i++) {
			temp = temp.link;
		}
		temp.den = d;
	}
	
	/**
	 *will sort the fractions in linked list in order of value of the fraction (from smallest to largest)
	 *Method 1: Transfer linked list to array, sort array, return array to linked list
	 */
	public void Sort() {
		//calculates size of array
		int size=0;
		for (Fraction temp = head; temp!=null; temp = temp.link) {
			size++;
		}
		//transfers objects in linked list into an array
		Fraction ref; //a temporary fraction that fractions in the array can be set to (without referencing)
		Fraction[] temp = new Fraction[size];
		int counter = 0;
		for (Fraction f = head; f!= null; f=f.link) {
			ref = new Fraction();
			ref = f;
			temp[counter] = ref;
			counter++;
		}
		//bubble sorts the array
		boolean swap;
		do {
			swap = false;
			for (int i = 0; i<size - 1;i++) {
				if ((double)temp[i].num/temp[i].den<(double)temp[i+1].num/temp[i+1].den) {
					ref = new Fraction();
					ref = temp[i];
					temp[i] = temp[i+1];
					temp[i+1] = ref;
					swap = true;
				}
			}
		} while(swap==true);
		
		//transfers array back to linked list
		for (int i = size-1; i>=0;i--) {
			addatFront(temp[i]);
		}
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
