// Count total set bits in all numbers from 1 to n
import java.util.*;
class C_setbit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            if((n&1)==1)
            c++;
            n=n>>1;
        }
        System.out.println("No. of set digit="+c);
    }
}
