import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        scn.close();
        int[] ans = twoSum(arr, target);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
