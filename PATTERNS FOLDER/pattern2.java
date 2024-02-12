import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }


        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         char ch=(char)('A'+j-1);
        //         System.out.print(ch);
        //         ch++;
        //     }	
        //     System.out.println();
        // }



    //     int c = n;
    //     int ans=0;
        
    //     while(n!=0){
    //      int ld =n%10;
    //    // System.out.print(ld);
    //     ans = ans*10+ld;
    //     n=n/10;
    //     // if(c==ans){
    //     //     System.out.println("true");
    //     // }
       
    //     }
    //    System.out.println(ans);
    //      if(c==ans){
    //         System.out.println("true");
    //     }else{
    //         System.out.println("false");
    //     }
      



        // int fact =1;
        // int i=1;
        // while(i<=n){
        //     fact = fact*i;
        //     i++;
        //     System.out.println(fact);
        // }



        
    //    for(int i=n;i>=1;i--){
    //         for(int j=i;j>0;j--){   
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    //      for(int i=2;i<=n;i++){
    //         for(int j=i;j>0;j--){   
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
 





        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=n;j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=n;j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
       
        // for(int i=1;i<=n;i++){
        //     char ch=(char) ('A'+n-i);
        //     for(int j=1;j<=i;j++){
               
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(n);
        //     }n--;
        //     System.out.println();
        // }
    }
    
}
