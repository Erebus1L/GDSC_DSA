import java.util.*;
public class MonotonicArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int n= scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
        scn.close();
        boolean ans = isMonotonic(arr);
        System.out.println(ans);
    }
    public static boolean isMonotonic(int[] nums) {
        boolean inc = increasing(nums);
        boolean dec = decreasing(nums);
        if(inc==true || dec == true){
            return true;
        }
        return false;
    }
    public static boolean increasing(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            if(arr[i] > arr[j]){
                return false;
            }
        }
        return true;
    }
    public static boolean decreasing(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            if(arr[i] < arr[j]){
                return false;
            }
        }
        return true;
    }
}
