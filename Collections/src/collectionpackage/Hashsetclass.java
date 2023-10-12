package collectionpackage;
import java.awt.*;
import java.util.HashSet;

public class Hashsetclass {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(100);
        HashSet hs2 = new HashSet(100, 0.90F);
        HashSet<Integer> hs3 = new HashSet<Integer>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);
        //hs.remove(5);
       // System.out.println(hs);
//no get or set
        //System.out.println(hs.contains("welcome"));
       // System.out.println(hs.isEmpty());
        //addAll, removeAll
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        System.out.println(hs1);
        //hs.addAll(hs1);  //union
       // System.out.println("union"+hs);
       // hs.retainAll(hs1);  //Intersection
       // System.out.println("intersection"+hs);
       // hs.removeAll(hs1);
        //System.out.println("difference"+hs);
        System.out.println("subset "+hs.containsAll(hs1));


    }
}
