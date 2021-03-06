package com.epsilon.entity;

public class InvalidNameException extends Exception {

	private static final long serialVersionUID = 360945363012822755L;

	public InvalidNameException() {
	}

	public InvalidNameException(String message) {
		super(message);
	}

	public InvalidNameException(Throwable cause) {
		super(cause);
	}

	public InvalidNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
