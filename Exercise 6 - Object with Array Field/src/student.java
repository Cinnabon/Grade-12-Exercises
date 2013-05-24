
public class student extends person {
	private String studentNum;
	private double avg;
	private double marks[] = new double[4];
	
	public student() {
		super();
		studentNum = "555555";
		for (int i = 0; i<marks.length;i++) {
			marks[i] = 0;
		}
		calculateAverage();
	}
	
	public void calculateAverage() {
		double sum = 0;
		for (int i = 0; i<marks.length;i++) {
			sum+=marks[i];
		}
		avg = sum/marks.length;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Student number: "+studentNum);
		for (int i = 0; i<marks.length;i++) {
			System.out.println("Mark "+(i+1)+" : "+marks[i]);
		}
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
	
	public boolean setMark(int index, double mark) {
		if (mark>=0 && mark <=100) {
			marks[index] = mark;
			return true;
		}
		else
			return false;
	}
	
	public double[] getMark() {
		return marks;
	}
	
	
}
