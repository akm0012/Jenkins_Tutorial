package Jenkins_Test;

public class Module_B {

	public Module_B() {
		// TODO Auto-generated constructor stub
	}

	public boolean is_positive_int(int param) {
		
		int result; 
		
		Module_A module_A = new Module_A();
		
		result = param * module_A.return_1();
		
		boolean isPositive = false;
		
		if (result > 0) {
			isPositive = true;
		}
		
		
		return isPositive;
	}
}
