import java.util.ArrayList;
import java.util.Arrays;

/**
 * pair_sum_1_optimal
 */
public class pair_sum_1_optimal {

    public static boolean pairs(ArrayList<Integer>list, int target) {
        int lp=0;
        int rp=list.size()-1;
        //Arrays.sort(arr);  for sorting the function
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int target=5;
        System.out.println( pairs(list, target));
    }
}