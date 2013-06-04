public class person {
  private String lastname;
	private int age;
	
	public person(){
		lastname = "MRSX";
		age = 18;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @param age the age to set
	 */
	public boolean setAge(int age) {
		boolean temp = false;
		if (age>0){
			this.age = age;
			temp = true;
		}
		return temp;
	}
	public void printData (){
		System.out.println("Last name: " + lastname);
		System.out.println("Age: " + age);
	}
}
