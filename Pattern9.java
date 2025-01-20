// Pattern 9
import java.util.*;
class Pattern9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i,sp=0,j;
        for(i=0;i<n;i++)
        {
            for(sp=0;sp<2*i;sp++)
            {
                System.out.print(" ");
            }
                for(j=0;j<4*n-4*i-1;j++)
                {
                    if(j<n-1||j>3*n-3*i-2)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=0;i<n-1;i++)
            {
                for(sp=0;sp<2*n-2*i-4;sp++)
                {
                    System.out.print(" ");
                }
                for(j=0;j<2*n+4*i-3;j++)
                {
                    if(j<n+i-3||j>=n+3*i)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
