// INSERT AN ELEMENT IN AN ARRAY
import java.util.*;
public class arrays9 {
    public static int takeInput(String str){
            Scanner sc = new Scanner(System.in);
            System.out.print(str);
            int input = sc.nextInt();
            return input;
    }
    public static int insert(int A[],int pos,int ele,int size,int cap){
        
        if(size<cap){
            for(int i=size;i>pos;i--){
                A[i]=A[i-1];
                }
                A[pos]=ele;
        }else if(size==cap){
            System.out.println("we cannot insert ");
        }
        
       
        size++;
        return size;
    }
    public static void main(String[] args) {
        //first we take input which is capacity,size,element,postion,array
        //thats why we create a method called takeInput to used them actively.
        //lets start....
        int cap = takeInput("Enter the capacity of an array = ");
        int size = takeInput("Enter the size of an array = ");
        int arr[]=new int[cap];
        for(int i=0;i<size;i++){
            arr[i]=takeInput("Enter the element at "+i+" index = ");
        }
        int ele = takeInput("Enter the element to be inserted = ");
        int pos = takeInput("Enter the postion where the element be inserted = ");
        //now we create insert method where array,pos,ele,size will go and swapping of the elements be done 
        //right to left swaping of the elements be done so that we dont lose any data(ele).
        size = insert(arr,pos,ele,size,cap);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
