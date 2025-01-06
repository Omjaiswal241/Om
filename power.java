import java.util.*;
class Power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur no.");
        int n=sc.nextInt();
        if((n&(n-1))==0)
        System.out.println("power of two");
        else
        System.out.println("not");

    }
}