//REVERSE THE ELEMENTS OF AN ARRAY
// TC = O(n)
import java.util.*;
public class arrays6 {
    public static void ReverseElement(int arr[]){
        int start =0,end= arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        ReverseElement(arr);
        System.out.print("REVERSED ARRAY : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
