// Divide two integers without using divide,multiplication and mod operator
class Divide {
    public static int divide(int dividend, int divisor) {
        if(dividend==0)
        {
        return 0;
        }
        else
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
        return Integer.MAX_VALUE;
        }

        boolean isnegative=(dividend<0)^(divisor<0);

        long absdividend=Math.abs((long)dividend);
        long absdivisor=Math.abs((long)divisor);

        long result=0;
        while(absdividend>=absdivisor)
        {
            long tempdivisor=absdivisor,multiple=1;

            while(absdividend>=(tempdivisor<<1))
            {
                tempdivisor<<=1;
                multiple<<=1;
            }
            absdividend-=tempdivisor;
            result+=multiple;
        }

        result = isnegative? -result: result;

        return (int)Math.min(Math.max(result, Integer.MIN_VALUE),Integer.MAX_VALUE);
        }
        public static void main(String args[])
        {
            int a=14;
            int b=3;
            System.out.println("Result"+divide(a,b));
        }
        
    }
