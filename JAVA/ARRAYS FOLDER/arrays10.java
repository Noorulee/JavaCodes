// SHIFT ALL ZEROS TO THE END
import java.util.*;
public class arrays10 {
    public static void swap(int arr[],int nz,int z){
        int temp = arr[nz];
        arr[nz]=arr[z];
        arr[z]= temp;
    }
    public static void pushEven(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            while((start<end)&&(arr[end]%2==0)){
                end--;
                if(start>=end){
                    break;
                }
            }
            if(arr[start]%2==0){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
            }
            start++;
        }
    }
    public static void pushZeros(int arr[]){
        int nz = 0;
        int z = 0;
        while(z<arr.length){
            //if(arr[z]%2==0)--->for odd 
            //if(arr[z]%2!=0)--->for even
            //if(arr[z]<0)--->for negatives   and so on...
            if(arr[z]==0){
                swap(arr,nz,z);
                nz++;
            }
            z++;
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the capacity of array = ");
    int len = sc.nextInt();
    System.out.print("enter the value of "+len+" elements in the array : ");
    int arr[]=new int[len];
    for(int i=0;i<len;i++){
        arr[i]=sc.nextInt();
    }
    pushZeros(arr);
    for(int i:arr){
        System.out.print(i+" ");
    }
    
        
    }
}

