package in.si.main.beans;

public class Student {

	private String stdName;
	private int stdRollNo;
	private float stdMarks;

	public Student(String stdName, int stdRollNo, float stdMarks) {
		super();
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdMarks = stdMarks;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getRollNo() {
		return stdRollNo;
	}

	public void setRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public float getMarks() {
		return stdMarks;
	}

	public void setMarks(float stdMarks) {
		this.stdMarks = stdMarks;
	}

	public void displayStdDetails() {
		System.out.println("Name : " + stdName);
		System.out.println("Rollno : " + stdRollNo);
		System.out.println("Marks : " + stdMarks);

	}

}
