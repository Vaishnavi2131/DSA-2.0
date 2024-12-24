import java.util.ArrayList;

/**
 * ccontainer_with_water_optimal
 */
public class ccontainer_with_water_optimal {
    public static int  optimal(ArrayList<Integer>list) {
        int maximumn=0;
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp) {
            int ht=Math.min(list.get(lp), list.get(rp));
            int wd=rp-lp;
            int currentm=ht*wd;
            maximumn=Math.max(maximumn, currentm);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return maximumn;
        
    }
    public static void main(String[] args) {
        
            ArrayList<Integer>list=new ArrayList<>();
            list.add(1);
            list.add(8);
            list.add(6);
            list.add(2);
            list.add(5);
            list.add(4);
            list.add(8);
            list.add(3);
            list.add(7);
            System.out.println( optimal(list));
           
        
    }
}