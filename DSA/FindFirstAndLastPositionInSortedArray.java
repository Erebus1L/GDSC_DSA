import java.util.*;
public class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        scn.close();
        int[] ans = firstAndLast(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] firstAndLast(int[] nums, int target){
        int start = -1;
        int end = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                start = i;
                end = i;
                break;
            }
        }
        if(start!=-1){
            for(int j = start; j<nums.length; j++){
                if(nums[j] ==target){
                    end = j;
                }
            }
        }
        return new int[] {start, end};
    }
}
