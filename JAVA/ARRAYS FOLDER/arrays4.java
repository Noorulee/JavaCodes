//SWAP ALTERNATE & SUM OF THE ELEMENTS OF ARRAYS
import java.util.*;
public class arrays4 {
    public static void SwapAlternate(int arr[]){
          for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
          }
    }
    public static int sumofelements(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        SwapAlternate(arr);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] +" ");
        }
        System.out.println();
        int sum =sumofelements(arr);
        System.out.println("SUM OF ELEMENTS OF AN ARRAYS : "+sum);


    }
}
