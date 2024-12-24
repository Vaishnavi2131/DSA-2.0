/**
 * printdec
 */
public class printdec {
    public static void printde(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printde(n-1);
    }

    public static void printin(int n) {
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printin(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printde(n);
        printin(n);
    }
}