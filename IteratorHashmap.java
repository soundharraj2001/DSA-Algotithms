import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class IteratorHashmap {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("abd",8);
        m.put("xyz",9);
        m.put("pqr",0);
        m.put("abd",0);
        Set s = m.entrySet();
//        System.out.println(s);
        Iterator sd = s.iterator();
        while (sd.hasNext()){
            Object o = sd.next();
            //because entry interface is a subinterface of map interface so initialize with Map.Entry;
            Map.Entry e = (Map.Entry)o; //downcasting
            if (e.getKey().equals("abd"))//comparing our keys from the user and get the value
                System.out.println(e.setValue(100));
        }
        System.out.println(m);
    }
}
