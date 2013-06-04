
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
		while (temp!=null){
			temp = temp.link;
		}
		temp = f;
		//add at front then reverse list
		
	}
	/*
	 * for (student temp = head; temp != null; temp= temp.link){
		System.out.println(temp.mark);
		//output contents of object using temp
	}

	 */
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
