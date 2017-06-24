package Generic;

public class Browser<B> {

	public B getName(B input){
		System.out.println("Input was: "+ input);
		return input;
	}
}
