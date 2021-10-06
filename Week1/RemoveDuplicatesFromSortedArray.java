import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        scn.close();
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    

}
