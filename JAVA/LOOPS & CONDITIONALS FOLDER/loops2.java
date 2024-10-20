import java.util.*;
public class loops2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int ans = 0;
          while(ans*ans<=n){
            ans++;
          } 
          ans=ans-1;
          System.out.println(ans);



        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int rev = 0;
        // //to find reverse of the number 
        // while(n>0){
        //     rev = rev*10+n%10;
        //     n=n/10;
        // }
        // System.out.println(rev);

    }
}
