package collectionpackage;

import java.util.HashMap;
import java.util.Map;

public class Hashmapclass {
    public static void main(String[] args) {
        //HashMap m = new HashMap();
        HashMap<Integer,String> m = new HashMap<Integer,String>();
        m.put(101,"J");
        m.put(102,"D");
        m.put(103,"F");
        m.put(104,"H");
        m.put(105,"A");
        System.out.println(m);
        System.out.println(m.get(105));
        m.remove(103);
        System.out.println(m);
        System.out.println(m.containsKey(101));
        System.out.println(m.containsValue(101));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        for (Map.Entry entry: m.entrySet()){
            System.out.println(entry.getKey()+ "      "+entry.getValue());


        }


    }
}
