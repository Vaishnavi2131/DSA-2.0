

public class Inverted_Half_Pytamid_Num {
    public static void Number(int n){
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {

        Number(5);
    }
}
