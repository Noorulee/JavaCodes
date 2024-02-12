//LINEAR SEARCH (FIND THE INDEX OF THE ELEMENT IN A GIVEN ARRAY)
import java.util.*;
public class arrays2 {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key =10;
        int index = linearSearch(arr,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND AT INDEX :"+index);
        }
    }
}
