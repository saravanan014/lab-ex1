//program to check the given number is armstrong
package armstrongnumber;
import java.util.Scanner;
public class ArmstrongNumber {
 public static void main(String[] args) {
        int n,a,r,result=0;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        a=n;
        while(n!=0)
        {
            r=n%10;
            result=result+(r*r*r);
            n=n/10;
        }
        if(a==result)
        {
            System.out.println("the given number is an armstrong");
         }
        

else
        {
            System.out.println("the given number is not an armstrong");
         }
        
    }
}

