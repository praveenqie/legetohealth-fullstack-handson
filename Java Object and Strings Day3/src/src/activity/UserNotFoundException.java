package src.activity;

public class UserNotFoundException extends Exception {

	UserNotFoundException() {
		super();
	}

	UserNotFoundException(String message) {
		super(message);
	}

	UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	UserNotFoundException(Throwable cause) {
		super(cause);
	}

	UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
