import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
          System.out.println("prime");
        }else{
             boolean isprime = true;
             //(n-1)=>Math.sqrt(n)=square root of n
        for(int i = 2;i<=(n-1);i++){
            if(n%i==0){
             isprime = false;
        }
    }
        if(isprime==true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    
        
        
 }   
}
}
// Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         if((year%100 != 0) || (year%400 == 0) ){
//             System.out.println("leap year");
//         }
//         else if( (year%4 == 0) && (year%100 != 0) ){
//             System.out.println("leap year");
//         }else{
//             System.out.println("not lp");
//         }
