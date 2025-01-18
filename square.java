// Calculate the square of a number without using *,/ and pow()
import java.util.*;
class Square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. to square");
        int n=sc.nextInt();
        int result=0,shift=0,temp;
        temp=n;
        while(temp!=0)
        {
            if((temp&1)==1){
            result+=(n<<shift);
            }
            temp=temp>>1;
            shift++;
        }
        System.out.println("Square of n is"+result);

    }
}