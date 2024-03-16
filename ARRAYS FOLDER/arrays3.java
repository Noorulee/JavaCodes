//LARGEST NUMBER IN AN ARRAY && SMALLEST NUMBER IN AN ARRAY
import java.util.*;
public class arrays3 {
    public static int getLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getSmallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
              min=arr[i];   
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of an array = ");
        int len = sc.nextInt();
        int arr[]=new int[len];
        System.out.print("enter elements of an array = ");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getLargest(arr));
        // int arr[]={2,3,4,56,78,7};
        // int largest = getLargest(arr);
         //System.out.println("LARGEST NUMBER IN AN ARRAY : "+largest);
        // int smallest = getSmallest(arr);
        // System.out.println("SMALLEST NUMBER IN AN ARRAY : "+smallest);

    }
}
