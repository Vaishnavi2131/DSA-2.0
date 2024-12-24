import java.util.*;
public class Sort_Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(8);
        list2.add(2);
        list2.add(3);
        list2.add(9);
        list2.add(7);
        System.out.println(list2);
        Collections.sort(list2);//asending order
        System.out.println(list2);
        Collections.sort(list2,Collections.reverseOrder()); //desending
        System.out.println(list2);
    }
}
