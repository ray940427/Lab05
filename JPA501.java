import java.util.Scanner;
public class JPA501 {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      while(true){
         int k=scn.nextInt();
            if(k==999)
               break;
         System.out.println(k+"的階乘="+fac(k)); 
      }
     }
     public static int fac(int n){
         if(n>=1&n!=999)
            return n*fac(n-1);
         else
           return 1;
        
        
     }
}
