// BUBBLE SORTING CODE
// TIME COMPLEXITY = O(n^2) cuz 2 loops are there
import java.util.*;
public class sorting1 {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap =0;
            for(int j=0;j<arr.length-1-turn;j++){
                //swapping 
                //we can arrange the array in increasing and decreasing order 
                //by just >/< sign
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   // swap++;
                }
                swap++;
            }
            System.out.print(swap+" ");
       }
       System.out.println();
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        bubblesort(arr);
        printArr(arr);
    }
}
