
/* In this we are printing the hallow rectangle pattern
 * first we have declare the int i,j then create a function in this function 
 * we have to write the toltal no if coloumns or rows foe satisfiyng  the condition
*/
public class HollowRect {
    public static void rectangle(int totalrow, int totalcol) {
        for(int i=1;i<=totalrow;i++){
            for(int j=1;j<=totalcol;j++){
                if(i==1|| i==totalrow || j==1 || j==totalcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rectangle(4, 5);
    }
    
}
