// Butterfly
import java.util.*;
class Butterfly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i,j,sp=(2*n)-3,st=1;
        for(i=1;i<=2*n-1;i++)
        {
            for(j=1;j<=st;j++)
            System.out.print("* ");
            for(j=1;j<=sp;j++)
            System.out.print("  ");
            int p=(i==n?st-1:st);
            for(j=1;j<=p;j++)
            System.out.print("* ");
            if(i<n)
            {
                st++;
                sp=sp-2;
            }
            else if(i>=n)
            {
                st--;
                sp=sp+2;
            }
            System.out.println();
        }
    }
}

