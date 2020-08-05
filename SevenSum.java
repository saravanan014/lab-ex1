//program to find sum of all numbers greater than 100 and less than 200 that are divisible by 7
package sevensum;
public class SevenSum {
      public static void main(String[] args) {
        int  sum=0;
        int j=0;
        for(int i=100;i<200;i++)
        {
              if(i%7==0)
              {
                sum=sum+i;
              }
          }
        System.out.println("The sum is:"+sum);
    }
 }
