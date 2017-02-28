package org.jacoco.examples.maven.java;

public class Hello {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
