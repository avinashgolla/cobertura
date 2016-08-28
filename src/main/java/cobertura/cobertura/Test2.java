package cobertura.cobertura;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testc() {
		int x = 0;
		while (x != 5) {
			x++;
		}
	}

	@Test
	public void testd() {

		int x = 0;
		if (x == 0) {
			System.out.println("X is zero");
		} else if (x == -1) {
			System.out.println("X is negative one");
		} else {
			System.out.println("X is invalid");
		}

	}
}
