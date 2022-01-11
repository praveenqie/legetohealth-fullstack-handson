package JavaFundamentalDay2;

public class StudentDate {

	private int studentId;
	private String studentName;
	private String city;
	private int marks1;
	private int marks2;
	private int marks3;
	private float feePerMonth;
	private boolean isEligebleForScholarship;

	StudentDate() {
	}
	
	

	public StudentDate(int studentId, String studentName, String city, int marks1, int marks2, int marks3,
			float feePerMonth, boolean isEligebleForScholarship) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.feePerMonth = feePerMonth;
		this.isEligebleForScholarship = isEligebleForScholarship;
	}



	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCity() {
		return city;
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public float getFeePerMonth() {
		return feePerMonth;
	}

	public boolean isEligebleForScholarship() {
		return isEligebleForScholarship;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}

	public void setEligebleForScholarship(boolean isEligebleForScholarship) {
		this.isEligebleForScholarship = isEligebleForScholarship;
	}

	public float getAnualFee(float feePerMonth) {
		return feePerMonth * 12;
	}

	public float getAvg() {
		float avg = getTotalMarks()/3;
		return avg;
	}
	
	public int getTotalMarks() {
		return this.marks1 + this.marks2 + this.marks3;
	}
	
	public String getResults() {
		if(this.marks1<60 || this.marks2<60 || this.marks3 <60) {
			return "fail";
		}
		return "pass";
	}
}
