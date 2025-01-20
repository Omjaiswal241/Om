// Pattern 7
import java.util.*;
class Pattern7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(j);
            for(j=1;j<=2*n-(2*i+1);j++)
            System.out.print(" ");
            
            int p=(i==n)?i-1:i;
            for(j=p;j>=1;j--)
            System.out.print(j);
            
            System.out.println();
        }
    }
}
