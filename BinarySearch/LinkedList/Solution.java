package LinkedList;

public class Solution {
    public double myPow(double x, int n) { 
        double  a=x;
        long b=n;
        double res=1;
        while(b>0)
        {
            if(b% 2==1)
            {
          res=res*a;
            }
            a=a*a;
            b=b/2;
        }
        return res;

    }
} {
    
}
