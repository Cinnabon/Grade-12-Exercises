
public class classroom {
	private String classCode;
	private student[] students;
	private double classAvg;
	

	public classroom(int y) { //y is the amount of students
		classCode = "ICS4U0";
		students = new student[y];
		for (int i = 0; i<y; i++)
			students[i] = new student();
		classAvg = 0;
	}
	
	public void average() { //calculates and sets average field in classroom to the correct amount
		double sum = 0;
		for (int i = 0; i< students.length; i++)
			sum += students[i].getAvg();
		classAvg = sum/students.length;
	}
	
	public void insertStudent(student s) { //adds new student object to end of array
		student[] temp = new student[students.length+1];
		for (int i = 0; i < students.length; i++)
			temp[i] = students[i];
		temp[students.length] = s;
		students = temp;
	}
	
	public void sort() {//highest to lowest
		boolean swap;
		student temp;
		do {
			swap = false;
			for (int i = 0;i<students.length-1;i++) {
				if (students[i].getAvg() < students[i+1].getAvg()) {
					temp = students[i];
					students[i] = students[i+1];
					students[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	
	public void printStudents() {//outputs fields of all students in classroom
		for (int i = 0; i< students.length; i++) {
			System.out.println("Student "+(i+1));
			students[i].printData();
		}
	}

	/**
	 * @return the classCode
	 */
	public String getClassCode() {
		return classCode;
	}

	/**
	 * @return the students
	 */
	public student getStudent(int x) {
		return students[x];
	}

	/**
	 * @return the classAvg
	 */
	public double getClassAvg() {
		return classAvg;
	}

	/**
	 * @param classCode the classCode to set
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
}
