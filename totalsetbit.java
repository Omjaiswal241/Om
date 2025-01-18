// Count total set bits in all numbers from 1 to n
import java.util.*;
class Totalsetbit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i,c,sum=0;
        for(i=1;i<=n;i++)
        {
            c=0;
            int x=i;
            while(x!=0)
            {
            if((x&1)==1)
            c++;
            x=x>>1;
        }
        sum+=c;
    }
        System.out.println("no. of setbit"+sum);
    }
}
