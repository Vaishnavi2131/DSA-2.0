public class substring {
    public static String sustring(String str,int si,int ei) {
        String subs="";
        for(int i=si;i<ei;i++){
            subs+=str.charAt(i);
        }
        return subs;
    }
    public static void main(String[] args) {
        String str="vaishnavi";
        System.out.println(sustring(str, 1, 3));
        System.out.println(str.substring(1,6));//inbuilt method
    }
}
