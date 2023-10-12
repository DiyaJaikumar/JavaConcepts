package collectionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList<Integer> al1= new ArrayList<Integer>();
        List al2 = new ArrayList();

        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('a');
        al.add(true);
        System.out.println(al);
        System.out.println("SIZE "+al.size());
        al.remove(1);//index or value can be passed
        System.out.println(al);
        al.add(1,5);
        System.out.println(al);
//get(index),set(index,value),al.contains(5), isEmpty()
        Iterator it= al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        String arr[]= {"a","b","c"};
        for(String val: arr){
            System.out.println(val);
        }
        ArrayList all = new ArrayList(Arrays.asList(arr));
        System.out.println(all);


    }

}
