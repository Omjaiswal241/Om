import java.util.*;
class Atob
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your nos.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int xor,c=0;
        xor=a^b;
        while(xor!=0)
        {
            
            if((xor&1)==1)
            c++;
            xor=xor>>1;
        }
        System.out.println("no. of set bit to convert" + c);

        
    }
}