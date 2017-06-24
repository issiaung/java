package Generic;

import java.sql.Date;

public class Overloading {
	public static void main(String[] args) {
		Overloading generic = new Overloading();
		//generic.overloadMethod(null);
	}
	
	public void overloadMethod(String data) {
		System.out.println("String");
	}
	
	public void overloadMethod(Date data) {
		System.out.println("Date");
	}
}
