package Jenkins_Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Module_A_Test {

	@Test
	public void test() {

		Module_A module_a = new Module_A();

		assertEquals("This should return 1", 1, module_a.return_1());
	}
	
	@Test
	public void test2() {

		Module_A module_a = new Module_A();

		assertEquals("This should return 1", 2, module_a.return_1() + 1);
	}

}
