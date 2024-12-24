/**
 * Creation_Array_list
 */
import java.util.*;
public class Creation_Array_list {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
       
        ArrayList<Boolean>list3=new ArrayList<>();

        list.add(2);
        list.add(4);
        System.out.println(list);

        //get element
        int element=list.get(0);
        System.out.println(element);

        // Remove element
        list.remove(1);
        System.out.println(list);
        
        //set element
        list.set(0,10);
        System.out.println(list);

        //contain element

        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        //size of
        System.out.println(list.size());

        

    }
}