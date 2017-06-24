package Generic;

interface Interface1 {
	int i=10;
	void method();
}

abstract class Parent {
	abstract void method();
}

public class InheritInterface extends Parent implements Interface1 {

	public void method() {
	}
	//This would be impossible if the visibility of method() in class Parent could not be increased.
	
	public static void main(String[] args) {
		System.out.println(Interface1.i);
	}
}