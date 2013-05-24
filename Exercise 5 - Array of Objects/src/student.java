
public class student extends person {
  private String studentNum;
	private double avg;
	
	public student() {
		super();
		studentNum = "555555";
		avg = 0.0;
	}
	public void printData() {
		super.printData();
		System.out.println("Student number: "+studentNum);
		System.out.println("Student average: "+avg);
	}
	/**
	 * @return the studentNum
	 */
	public String getStudentNum() {
		return studentNum;
	}
	
	/**
	 * @param studentNum the studentNum to set
	 */
	public boolean setStudentNum(String studentNum) {
		boolean temp=false;
		int digits = studentNum.length();
		if (Integer.parseInt(studentNum)>=0&&digits==6){//ensures not negative and 6 digits
			this.studentNum = studentNum;
			temp = true;
		}
		return temp;
		
	}

	/**
	 * @return the avg
	 */

	public double getAvg() {
		return avg;
	}
	/**
	 * @param avg the avg to set
	 */
	public boolean setAvg(double avg) {
		boolean temp = false;
		if (avg>0) {
			this.avg = avg;
			temp = true;
		}
		return temp;
	}
	
	
}
