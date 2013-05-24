
public class person {
  private String last_name;
	private int age;
	
	public person() {
		last_name="MRSX";
		age = 18;
	}
	public void printData() {
		System.out.println("Last name: "+last_name);
		System.out.println("Age: "+age);
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @param age the age to set
	 */
	public boolean setAge(int age) {
		boolean temp = false;
		if (age>0) {
			this.age = age;
			temp = true;
		}
		return temp;
	}
}
