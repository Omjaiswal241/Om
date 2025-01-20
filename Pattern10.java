import java.util.*;
class Pattern10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int r,c;
        for(r=1;r<=n;r++)
        {
            for(c=1;c<=n;c++)
            {
                if(r==(n+1)/2||c==(n+1)/2)
                System.out.print("*\t");
                else if(r==1&&c<(n+1)/2)
                System.out.print("*\t");
                else if(r==n&&c>(n+1)/2)
                System.out.print("*\t");
                else if(c==1&&r>(n+1)/2)
                System.out.print("*\t");
                else if(c==n&&r<(n+1)/2)
                System.out.print("*\t");
                else
                System.out.print("\t");}
                System.out.println();
            
        }
    }
}