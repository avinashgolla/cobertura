package cobertura.cobertura;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void testa() {
			int x = 2;
		if (x == 0) {
			System.out.println("X is zero");
		} else {
			System.out.println("X is invalid");
		}
	}
	
	@Test
	public void testb() {
		
		for (int x = 0; x < 5; x++) {
			  System.out.println(x);
			}
			}
	

}
