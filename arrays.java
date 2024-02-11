import java.util.*;
public class arrays {
    public static void update(int marks[]){
        
        for( int i=0;i<marks.length;i++){
             marks[i]=marks[i]+1;
        }
    }
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is "+ smallest);
        return largest;
    }
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }if(numbers[mid]<key){
                 start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }

    }
    public static void printpair(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j= i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("totalpairs="+tp);
    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        printpair(numbers);
    //     reverse(numbers);
    //   // System.out.println("index number is "+ binarySearch(numbers,key));
    //     // for(int i=0;i<numbers.length;i++){
    //     //     System.out.print(numbers[i]+",");
    //     // }




        // int numbers[]={2,4,6,8,10,12,16};
        // int key =10;
        // int index =linearSearch(numbers,key);
        // if(index==-1){
        //     System.out.println("not found");
        // }else{
        //     System.out.println(index);
        // }

        // int marks[]={97,98,99};
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }




        //int mark[] = new int[100];
        //Scanner sc = new Scanner(System.in);
        // mark[0]=sc.nextInt();
        // mark[1]=sc.nextInt();
        // mark[2]=sc.nextInt();
        // System.out.println("phy = "+mark[0]);
        // System.out.println("chem = "+mark[1]);
        // System.out.println("math = "+mark[2]);
        // int percentage = (mark[0]+mark[1]+mark[2])/3;
        // System.out.println(percentage+"%");

        
    }
}
