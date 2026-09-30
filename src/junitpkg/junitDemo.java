package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junitDemo {
@Before
public void encSetup() {
	System.out.println("browser setup");
}
@Test
public void titleVerification() {
	System.out.println("Title Verification");
}
@Test
public void currentUrlVerification() {
	System.out.println("Url Verification");
}
@Test
public void containsText() {
	System.out.println("Text contains");
}
@After
public void browserClose() {
	System.out.println("browser Close");
}
}