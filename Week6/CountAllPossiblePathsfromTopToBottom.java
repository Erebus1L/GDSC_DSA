public class CountAllPossiblePathsfromTopToBottom {
    class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        long N = n+m-2;
        long r = m-1;
        double res = 1;
        for(int i=1; i<=r; i++){
            res = res * (N-r+i)/i;
        }
        return (long)res;
        
    }
    
}
}
