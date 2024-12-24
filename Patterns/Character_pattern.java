public class Character_pattern {
    public static void Char_pattern(int n) {
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        Char_pattern(n);
    }
}
