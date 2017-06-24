package Hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by meghamehta on 5/21/2017.
 */
public class WorkingOfHashSet {
    public static void main(String[] args) {
        Set set = new HashSet();

        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(1));
        System.out.println(set);
    }
}
