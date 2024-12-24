import java.util.*;
public class Largest {

    public static int BruteLLargest(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
        
    }
    public static int OptimalLargest(int arr[]){
        int largest= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            
                arr[i] = sc.nextInt();
            
        }
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+" ");
        
    }
     System.out.println(BruteLLargest(arr));
     System.out.println(OptimalLargest(arr));



    }
}