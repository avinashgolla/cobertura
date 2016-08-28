package cobertura.cobertura;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void test1() {
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		int x = 0;
		while (x != 5) {
			x++;
		}
	}
}
