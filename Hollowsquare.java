// Hollow Square PAttern
import java.util.*;
class Hollowsquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
            if(i==1||j==n||i==n||j==1){
            System.out.print(j+" ");}
            else{
            System.out.print("  ");}}
            System.out.println();
        }
    }
}