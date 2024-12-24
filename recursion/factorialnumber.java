public class factorialnumber {
    public static int fact(int n) {
        if(n==0){
            
            return 1;
        }
            int fn=fact(n-1);
            int fn1=n*fact(n-1);
            return fn1;
            
        
    }
   
    public static void main(String[] args) {
        int n=5;
        
        System.out.println(fact(n));
    }
}
