// BINARY SEARCH CODE(FIND THE INDEX OF THE ELEMENT)
//Time Complexity of binary search = (log n) which is O(log n)
//TC of (linearSearch > BinarySearch) which means binary search code is better than linear search
// for eg: size of array = 8; LS= O(8) while BS= O(4) which is half of the linear search time complexity.
import java.util.*;
public class arrays5 {
    public static int BinarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;   // right
            }else{
                end=mid-1;     //left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int arr[]={2,4,6,8,10,12,14};
      int key = 14;
      System.out.println("key is at index : "+BinarySearch(arr,key));
    }   
}
