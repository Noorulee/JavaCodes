//UPDATING AN ARRAY;
import java.util.*;
public class arrays12 {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }
    public static void updateKey(int arr[],int key,int newkey){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                arr[i]=newkey;
                return;
            }
        }
        System.out.println("data not found");
    }
    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity of an array = ");
        int arr[]=new int[cap];
        for(int i =0;i<cap;i++){
            arr[i]= takeInput("enter the elements of array at "+i+" index = ");
        }
        int key = takeInput("enter the key which needs to be replaced = ");
        int newkey = takeInput("enter the newkey  = ");
        updateKey(arr,key,newkey);
        for(int i:arr){
            System.out.print(i+ " ");
        }


    }
}
