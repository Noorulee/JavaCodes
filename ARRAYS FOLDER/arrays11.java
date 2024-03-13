import java.util.*;
public class arrays11 {
    public static void rotate(int arr[],int x,int b[]){
       
       for(int i=0;i<arr.length;i++){
        b[(i+x)%arr.length]=arr[i];
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the direction of the rotation = ");
        // String dir = sc.nextLine();
        System.out.print("enter the shift = ");
        int x = sc.nextInt();
        System.out.print("enter the capacity of an array = ");
        int len = sc.nextInt();
        System.out.println("enter the value of "+len+" elements in an array : ");
        int arr[]=new int[len];
        int b[]=new int[arr.length];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,x,b);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
