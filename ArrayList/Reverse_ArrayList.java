import java.util.ArrayList;

public class Reverse_ArrayList {
    public static void main(String[] args) {
        //reverse element
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(3);

        for(int i=list2.size()-1;i>=0;i--){
            System.out.print(list2.get(i)+" ");

        
        }
            
        System.out.println();
    }
}
