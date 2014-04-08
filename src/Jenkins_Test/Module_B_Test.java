package Jenkins_Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Module_B_Test {

	@Test
	public void test() {

		Module_B module_b = new Module_B();

		assertEquals("This should return True", true,
				module_b.is_positive_int(5));
	}

}
