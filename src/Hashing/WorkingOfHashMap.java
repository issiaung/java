package Hashing;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by meghamehta on 5/21/2017.
 */
public class WorkingOfHashMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.get(1);

        Set<Map.Entry<Integer, Integer>> mapSet = map.entrySet();

        //Method-1 to access individual entries
        for(Map.Entry<Integer, Integer> entry : mapSet){
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

        //Method-2 to access individual entries

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, Integer> elmt = it.next();
            System.out.print(elmt.getKey());
            System.out.println(elmt.getValue());
        }

    }
}
