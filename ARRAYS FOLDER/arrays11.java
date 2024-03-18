//ROTATING AN ARRAY
import java.util.*;
public class arrays11 {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }
    public static void rotate(int arr[],int x,int dir,int b[]){
       
       if(dir==1){
        for(int i=0;i<arr.length;i++){
            b[(i+x)%arr.length]=arr[i];
        }
       }else if(dir==0){
        for(int i=0;i<arr.length;i++){
            b[(i-x+arr.length)%arr.length]=arr[i];
        }
       }
       
    }
    public static void main(String[] args) {
        int x = takeInput("enter the number of rotations = ");
        int dir =takeInput("enter 1 if right and 0 if left ");
        int len = takeInput("enter the value of len = ");
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=takeInput("enter the element of array at "+i+" index = ");
        }
        int b[]=new int[arr.length];
        rotate(arr,x,dir,b);
        for(int i:b){
            System.out.print(i+" ");
        }

    }
}
