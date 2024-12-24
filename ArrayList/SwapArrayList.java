import java.util.*;
public class SwapArrayList {
    public static void Swap(ArrayList<Integer>list2,int index1,int index2) {
        int temp=list2.get(index1);
        list2.set(index1, list2.get(index2));
        list2.set(index2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(3);
        list2.add(9);
        list2.add(7);

        
        int index1=3;
        int index2=4;
        System.out.println(list2);
        Swap(list2, index1, index2);
        System.out.println(list2);

    }
}
