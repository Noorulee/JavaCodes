import java.util.*;
public class patterns {
    public static void main(String[] args) {
        //hello
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("*");
        }else{
          for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}System.out.println();
		}
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}System.out.println();
        }
        }
        





        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }int p=i;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(p);
        //         p++;

        //     }p=p-2;
        //     for(int k=1;k<i;k++){
        //         System.out.print(p);
        //         p--;
        //     }
        //     System.out.println();
        // }


        
        // for(int i =1;i<=n;i++){
        //     char ch =(char)('A'+n-1);
		// 	for(int j=1;j<=i;j++){
               
		// 		System.out.print(ch);
        //         ch++;
                
		// 	}System.out.println();
		// }




        // int n=1,sum,i=1;
		// while(n<=x && n<=1000)
		// {
		// 	sum=(3*i)+2;
		// 	if(sum%4!=0)
		// 	{
		// 		System.out.print(sum+" ");
		// 		n=n+1;
		// 	}
		// 	i=i+1;
		// }
        
        // int n=1;
        // int counter =1;
        // int term;
        // while(n<=x && n<=1000){
        //   term = (3*counter)+2;
        //  if(term%4!=0){
        //     System.out.print(term+ " ");
        //     n=n+1;
        //  }
        //  counter=counter+1;
        // }
        

        
        
        
        // int product = 1;
        // int sqrt;
        // // if(n==0||x==0){
        // //     System.out.println("1");
        // // }
        // //  if(n==0){
        // //     System.out.println("1");
        // //  }


        //     while(n>0){
        //    product = product * x;
        //    n--;
        // }
        // sqrt=product-1;
        //    System.out.println(sqrt);
          





        // int p=1;
        //   for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1||i==n){
        //             System.out.print(p);
        //             p++;
        //         }else if(j==1||j==n){
        //             System.out.print(p);
        //             p++;
        //         } 
        //         else{
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        //      p=1;
        //   }








        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }for(int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }
            
        //     System.out.println();
        // }
         



        //  for(int i=1;i<=n;i++){
        //     for(int j=i;j>0;j--){
        //         System.out.print(j);
        //     }System.out.println();
        //  }



        // for(int i=1;i>0 && i<=n;i++){
        //     int prod = i*i;
        //     while(prod<n){
        //         System.out.println();
        //     }
        // }
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i-1;j++){
        //           System.out.print(" ");
        //     }for(int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }for(int j=1;j<=2*i-1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();   
        // }

        
        //   for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);   
                
        //     }
        //     System.out.println();
        //   }


        //   for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+i-1);
        //     }System.out.println();
        //   }



        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //    System.out.println();
        // }
        
        // for(int i=1;i<=n;i++){
        //    //stars
        //    for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //    }
        //    //spaces
        //    for(int j=1;j<=2*(n-i);j++){
        //     System.out.print(" ");
        //    }
        //    //stars
        //    for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //    }
        //   System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //    //stars
        //    for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //    }
        //    //spaces
        //    for(int j=1;j<=2*(n-i);j++){
        //     System.out.print(" ");
        //    }
        //    //stars
        //    for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //    }
        //   System.out.println();
        // }






        
        

        
        // int j =1;
        
        // if(n==2){
        //     System.out.println("-1");
        // }
        
        // for(int i=2;i<n;i++){
        
        // if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
       
         
       
       
    }
        
        

    }
