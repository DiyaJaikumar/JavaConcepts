package collectionpackage;

import java.util.Hashtable;

public class Hashtableclass {
    public static void main(String[] args) {
        Hashtable t= new Hashtable();
        Hashtable<Integer,String> ht= new Hashtable<Integer, String>();
        ht.put(101,"a");
        ht.put(102,"b");
        ht.put(103,"c");
       // ht.put(null,"d");  ----> NullPointerException
       // ht.put(104,null);------> NullPointerException

        System.out.println(ht);
        System.out.println(ht.get(103));
        ht.remove(103);
        System.out.println(ht);
        System.out.println(ht.containsKey(101));
//containsValue,isEmpty,keySet,values,



    }
}
