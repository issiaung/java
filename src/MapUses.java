import java.util.HashMap;
import java.util.Map;


public class MapUses {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		System.out.println(map.put("hey", 1));
		System.out.println(map.put("hey", 2)); //Returns the previous value stored in key
		System.out.println(map.put("heya", 2)); //Returns the previous value stored in key
		
		System.out.println(map.replace("hey", 4)); //Replaces the value associated with key with new value
		System.out.println(map.replace("hey", 4, 6));
		System.out.println(map.values());
		System.out.println(map);
		
		//Integers
		System.out.println(new Integer(1).compareTo(-22));//returns 0 if LHS=RHS, 1 if LHS>RHS, -1 if LHS<RHS
		
	}
}
