package com.mobiquity.atms.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AtmListException {
	@Test
	public void testNoArgs() {
		AtmLocatorException exception = new AtmLocatorException();
		Assertions.assertNotNull(exception);
	}

	@Test
	public void testOneArgs() {
		AtmLocatorException exception = new AtmLocatorException("sample");
		Assertions.assertNotNull(exception);
	}

	@Test
	public void testTwoArgs() {
		AtmLocatorException exception = new AtmLocatorException("sample", "sample1");
		Assertions.assertNotNull(exception);
	}
}
