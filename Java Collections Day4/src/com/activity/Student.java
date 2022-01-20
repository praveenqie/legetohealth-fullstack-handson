package arrayList;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public int compareTo(Student comparestu) {
		int compareage = ((Student) comparestu).getStudentage();

		// For Ascending order
		return this.studentage - compareage;

		// For Descending order do like this
		// return compare age-this.studentage;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}

	public static Comparator<Student> StuRollno = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			int rollno1 = s1.getRollno();
			int rollno2 = s2.getRollno();
			return rollno1 - rollno2;
		}
	};
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
		   String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   return StudentName1.compareTo(StudentName2);
	    }};


}
