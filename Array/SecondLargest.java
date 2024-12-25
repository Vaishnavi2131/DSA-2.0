import java.util.*;

public class SecondLargest {
    public static int Brute(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-2];
    }

    public static int Optimal(int arr[]){
        int largest=Integer.MIN_VALUE;
        int seclargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }

            if(arr[i]>seclargest && arr[i]<largest){
                seclargest=arr[i];
            }


        }
        return seclargest;

    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array Elements: ");
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
       }
       System.out.println();
       System.out.println(Brute(arr));
       System.out.println(Optimal(arr));

        

    }
}
