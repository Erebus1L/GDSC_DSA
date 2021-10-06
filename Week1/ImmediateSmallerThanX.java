import java.util.*;
public class ImmediateSmallerThanX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();
        int ans = immediateSmaller(arr, n, x);
        System.out.println(ans);
    }
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
        int ans = -1;
        int pot = -1;
        for(int i=0; i<n; i++){
            if(arr[i] < x){
                pot = arr[i];
                ans = Math.max(ans, pot);
            }
        }
        return ans;
    }
}
