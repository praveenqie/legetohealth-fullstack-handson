package JavaFundamentalDay2;

public class TestMain {

	public static void main(String[] args) {

		StudentDate studentDate1 = new StudentDate(1, "akul", "banglore", 65, 75, 61, 150, false);
		StudentDate studentDate2 = new StudentDate(1, "arun", "agra", 55, 75, 46, 190, true);
		StudentDate studentDate3 = new StudentDate(1, "banu", "uttar [radesh", 67, 90, 83, 100, false);

		System.out.println("-------------Student who has the highest total marks----------------------------");
		StudentDate date1 = highestMarkStudent(studentDate1, studentDate2, studentDate3);
		System.out.println(date1.getStudentName());

		System.out.println("-------------Student who has the least Montly Fees----------------------------");
		StudentDate date2 = leastMontlyFee(studentDate1, studentDate2, studentDate3);
		System.out.println(date2.getStudentName());

		System.out.println(
				"-------------, total marks , average marks , result, and “Scholarship available” or “Scholarship not available----------------------------");
		studentEligibility(studentDate1);
		studentEligibility(studentDate2);
		studentEligibility(studentDate3);

	}

	private static void studentEligibility(StudentDate studentDate1) {

		System.out.println("Name :" + studentDate1.getStudentName());
		System.out.println("Total Marks :" + studentDate1.getTotalMarks());
		System.out.println("Avg Marks :" + studentDate1.getAvg());
		System.out.println("Results :" + studentDate1.getResults());

		if (studentDate1.isEligebleForScholarship()) {
			System.out.println("Scholarship available");
		} else {
			System.out.println("Scholarship not available");
		}

	}

	private static StudentDate leastMontlyFee(StudentDate studentDate1, StudentDate studentDate2,
			StudentDate studentDate3) {

		if (studentDate1.getFeePerMonth() < studentDate2.getFeePerMonth()
				&& studentDate1.getFeePerMonth() < studentDate3.getFeePerMonth()) {
			return studentDate1;
		} else if (studentDate2.getFeePerMonth() < studentDate3.getFeePerMonth()) {
			return studentDate2;
		} else {
			return studentDate3;
		}

	}

	public static StudentDate highestMarkStudent(StudentDate studentDate1, StudentDate studentDate2,
			StudentDate studentDate3) {

		if (studentDate1.getTotalMarks() > studentDate2.getTotalMarks()
				&& studentDate1.getTotalMarks() > studentDate3.getTotalMarks()) {
			return studentDate1;
		} else if (studentDate2.getTotalMarks() > studentDate3.getTotalMarks()) {
			return studentDate2;
		} else {
			return studentDate3;
		}
	}
}
