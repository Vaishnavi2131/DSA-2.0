/**
 * Hashmap
 */
import java.util.*;
public class Hashmap {

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",10);
        hm.put("Indonatia",9);
        hm.put("Indigo",8);
        System.out.println(hm);

        //get(key)

        int population =hm.get("India");
        System.out.println(population);

        // containkey
        System.out.println(hm.containsKey("India"));

        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}