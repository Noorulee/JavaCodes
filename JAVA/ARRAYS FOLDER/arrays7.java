//TO FIND PAIRS IN AN ARRAY
//TC = O(n^2) cuz 2 loops are there
import java.util.*;
public class arrays7 {
    public static void printpairs(int arr[]){
        int tp = 0;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("totalpair : "+tp);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8};
        printpairs(arr);
        //this is imp interviewer can ask, in above code,we found total pairs.
        // to find total pairs we have a formula of AP
        //n(n-1)/2

    }
}
