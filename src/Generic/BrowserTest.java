package Generic;

public class BrowserTest {

	public static void main(String[] args) {

		//Here generic class accepts STRING 
		Browser<String> bt  = new Browser<String>();

		System.out.println(bt.getName("gibberisg"));
		
		//Here generic class accepts INTEGER
		Browser<Integer> bt1 = new Browser<Integer>();

		System.out.println(bt1.getName(1));
	}

}
