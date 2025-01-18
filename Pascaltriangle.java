// Pascal triangle pattern
import java.util.*;
class Pascaltriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int r,c,value;
        for(r=0;r<n;r++)
        {
            for(int j=n;j>r;j--)
            System.out.print(" ");
            value=1;
            for(c=0;c<=r;c++)
            {
                System.out.print(value+" ");
                value=value*(r-c)/(c+1);
            }
            
            System.out.println();
        }

    }
}