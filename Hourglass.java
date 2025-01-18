// Hourglass pattern
import java.util.*;
class Hourglass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        char ch;
        int i,j,l=2*n-1,sp=0;
        for(i=1;i<=2*n-1;i++)
        {
            ch='A';
            for(j=0;j<sp;j++){
            System.out.print("  ");}
            for(j=1;j<=l;j++){
            System.out.print(ch+" ");
            ch++;
            }
            if(i<n)
            {
                l=l-2;
                sp++;
            }
            else if(i>=n)
            {
                l=l+2;
                sp--;
            }
            System.out.println();
        }
        }
    }

