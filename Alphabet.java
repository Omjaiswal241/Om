// Alphabet pattern 
import java.util.*;
class Alphabet{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        char ch;
        int i,j,sp=2*(n-1);
        for(i=0;i<5;i++)
        {

            ch='A';
            {

            for(j=0;j<=i;j++)
            {
            System.out.print(ch);
            ch++;
            } 

            for(j=sp;j>0;j--)
            {
                System.out.print(" ");
            }

                ch-=1;
                for(j=0;j<=i;j++)
                {
                System.out.print(ch);
                ch--;
                }
                sp=sp-2;
            }
             System.out.println();
        }
    }
}
