// Find the position of the only set bit
import java.util.*;
class Position
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur no.");
        int n=sc.nextInt();
        int pos=1;
       while(n!=0)
       {
        if((n&1)==1)
        System.out.println(pos);
       
       pos++;
       n=n>>1;

       
       }

    }
}
