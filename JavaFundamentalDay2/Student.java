package JavaFundamentalDay2;

public class Student extends Person {

	private int rollNo;

	private String grade;

	public Student(int rollNo, String grade, String name, String gender) {
		super(name, gender);
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void display() {
		super.display();
		System.out.println("Emplyee grade:" + grade + "Employee roll number" + rollNo);
	}

}
