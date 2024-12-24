import java.util.*;
public class operations {
    public static void main(String[] args) {
        //charAt
        String str="Vaishnavi";
        String vtr="Sapkal";
        System.out.println(str.charAt(8));
        System.out.println(str.length());
        System.out.println(str.indexOf('a'));
        System.out.println(str.compareTo(vtr));
        System.out.println(str.contains("a"));
        System.out.println(str.startsWith("v"));
        System.out.println(str.endsWith("i"));
        System.out.println(str.concat(vtr));
        System.out.println(str.substring(1, 3));

    }
    
}
