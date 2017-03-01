package org.ijtest.com;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HelloWorldTest {

	private Hello subject;

	@Before
	public void setup() {
		subject = new Hello();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
}
