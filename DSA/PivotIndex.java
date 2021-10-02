import java.util.*;

import javax.naming.ldap.ManageReferralControl;
public class PivotIndex {
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n= scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            
            scn.close();
            int ans = pivotIndex(arr);
            System.out.print(ans);
        }
        public static int pivotIndex(int[] nums) {
            //         int ans=-1;
            //         for(int i=0; i<nums.length; i++){
            //             int start = 0;
            //             int end = nums.length-1;
            //             int lsum = 0;
            //             int rsum = 0;
            //             while(start<i){
            //                 lsum += nums[start];
            //                 start++;
            //             }
            //             while(end>i){
            //                 rsum += nums[end];
            //                 end--;
            //             }
            //             if(lsum == rsum){
            //                 if(ans!=-1)
            //                 ans = Math.min(ans, i);
            //                 else
            //                     ans = i;
            //             }
                        
            //         }
            //         return ans;
                    int sum  = 0;
                    for (int i = 0; i < nums.length; i++) {
                        sum += nums[i];
                    }
                    
                    // if pivot is at index 0;
                    int rightSum = sum - nums[0];
                    int leftSum = 0;
                    
                    if (rightSum == leftSum) {
                        return 0;
                    }
                    
                    // traverse through array, compare left and right sum as they change
                    for (int i = 1; i < nums.length; i++) {
                        rightSum -= nums[i];
                        leftSum += nums[i - 1];
                        if (rightSum == leftSum) {
                            return i;
                        }
                    }
                    return -1;
                    
                }
}
