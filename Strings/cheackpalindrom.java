public class cheackpalindrom {
    public static boolean pali(String str) {
        for(int i=0;i<str.length();i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        String str="vaishnavi";
        pali(str);
        System.out.println(pali(str));

    }
}
