class Print1toNwithoutLoops{
    class Solution{
        void printTillN(int n){
            // code here
            if(n==0) return;
            printTillN(n-1);
            System.out.print(n+" ");
        }
    }
}