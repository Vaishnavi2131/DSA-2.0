/**
 * string
 */
import java.util.*;
public class string {

    public static void main(String[] args) {
        char str1[]={'A','b'};
        String str2="Vaishnavi";
        String str3=new String("sapkal");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); //length of string
        String concati=str2+" "+str3; // concatination
        System.out.println(concati);
    }
}