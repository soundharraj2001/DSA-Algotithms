import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMaps {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Kohli",18);
        hm.put("Dhoni",7);
        hm.put("ABD",17);
        hm.put("Steyn Gun",8);
        System.out.println(hm);

        Set s = hm.entrySet();
        System.out.println(s);
        Collection sd = hm.values();
        System.out.println(sd);
        System.out.println(hm.keySet());



        //iterator in hashmap
        Iterator <Set> i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
