/**
 * charat
 */
public class charat {
    public static void chara(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str="vaishnavi";
        chara(str);
    }
}