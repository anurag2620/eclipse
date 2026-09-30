package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterPro {

	@Parameters("v")
	@Test
	public void parameter(String vi) {
		System.out.println("Value is "+vi);
	}
}
