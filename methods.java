import java.util.*;

public class methods{
    public static void swap(int a,int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static int product(int a, int b){
        int prod =a*b;
        System.out.println(prod);
        return prod;
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
         
        return fact;
    }
    public static int bincoeff(int n, int r){
        int n_fact =factorial(n);
        int r_fact = factorial(r);
        int nmr_fact= factorial(n-r);
        int bincoeff = n_fact/(r_fact*nmr_fact);
       return bincoeff;  
        }
    public static int bintodec(int n){
        int pow=0;
        int decnum =0;
        while(n>0){
            int ld = n%10;
            decnum = decnum + (ld * (int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        return decnum;
    }    
    public static int dectobin(int n){
        int mynum = n;
        int pow=0;
        int binnum = 0;
        while(n>0){
            int rem = n%2;
            binnum = binnum + (rem* (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
         System.out.println(binnum);


        return n;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        
       
      }
      
       
    }
