import java.io.*;
class PowerOfTwo{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n)
    {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==0){
            return isPowerOfTwo(n/2);
        }
        else{
            return false;
        }
    }

    
}