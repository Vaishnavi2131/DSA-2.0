public class Inverted_triangle {
    public static void Tria(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        Tria(n);
    }
}
