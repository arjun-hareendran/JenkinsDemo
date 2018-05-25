import static org.junit.Assert.*;

import org.junit.Test;

public class MathamaticalTest {

	@Test
	public void test() {

		Mathamatical obj = new Mathamatical();
		assertTrue(obj.add(2, 2) == 4);

	}

	@Test
	public void test2() {

		Mathamatical obj = new Mathamatical();
		assertTrue(obj.add(4, 4) == 8);

	}

}
