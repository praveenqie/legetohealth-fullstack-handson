package src.activity;

import java.util.Objects;
import java.util.Scanner;

public class UserMainClass {

	public static void main(String[] args) throws UserNotFoundException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		User user1 = new User(2, "naveen", 28);
		User user2 = new User(4, "praveen", 26);
		User user3 = new User(5, "kallesh", 22);
		User user4 = new User(8, "akshay", 21);

		User[] users = { user1, user2, user3, user4 };
		System.out.println("Enter employee id to get details:");
		int empId = sc.nextInt();

		try {
			User userData = searchUser(empId, users);
			System.out.println("==================User Details==================");
			System.out.println("User id :" + userData.getId() + "User name:" + userData.getName() + "User age :"
					+ userData.getAge());
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static User searchUser(int empId, User[] users) throws UserNotFoundException {
		boolean isUserExists = false;

		for (User user : users) {
			if (Objects.isNull(user)) {
				throw new UserNotFoundException("User data is Empty");
			}
			if (user.getId() == empId) {
				isUserExists = true;
				return user;
			}
		}
		if (!isUserExists) {
			throw new UserNotFoundException("User Not Found!");
		}

		return null;
	}

}
