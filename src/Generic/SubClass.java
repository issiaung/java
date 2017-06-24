package Generic;

abstract class AbstractClass {
	abstract void method();
	
	void method1(){
		System.out.println("Inside Base");
	}
	
	void method2(){
		System.out.println("Inside Base");
	}
	
}

public class SubClass extends AbstractClass{

	@Override
	void method() {
		System.out.println("Inside sub");
	}
	
	void method1(){
		System.out.println("Inside sub again");
	}

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.method();
		sub.method1();
		sub.method2();
		
		AbstractClass sub1 = new SubClass();
		sub1.method();
		sub1.method1();
		sub1.method2();
	}

}
