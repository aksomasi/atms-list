package com.mobiquity.atms.exceptions;

public class AtmLocatorException extends Exception {

	String msg;
	String details;

	private static final long serialVersionUID = 1L;

	public AtmLocatorException() {
		super();
	}

	public AtmLocatorException(String msg) {
		this.msg = msg;
	}

	public AtmLocatorException(String msg, String details) {
		this.msg = msg;
		this.details = details;
	}
}
