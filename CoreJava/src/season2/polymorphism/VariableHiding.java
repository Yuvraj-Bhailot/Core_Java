package season2.polymorphism;

/* variable hiding means subclass declaring a variable with the same name as a variable in its parent class
 * variable shadow means variable defined within an inner scope has the exact same name as a variable defined in an outer scope
 * */

class VarOne {
	String var = "Var One";

	public void display() {
		String var = "display var"; // variable shadowing
		System.out.println("This is: " + var);
	}
}

class VarTwo extends VarOne {
	String var = "Var Two";
}

public class VariableHiding {
	public static void main(String[] args) {
		VarOne vo = new VarOne();
		System.out.println("This is: " + vo.var);
		vo.display();

		VarTwo vt = new VarTwo();
		System.out.println("This is: " + vt.var);

		VarOne vo1 = new VarTwo();
		System.out.println("This is: " + vo1.var);

		VarTwo vt1 = (VarTwo) vo1;
		System.out.println("This is: " + vt1.var);
	}
}
