package Week2;
import java.util.*;
class Solution {
    public int maxSubArray(int[] arr) {
        int ans = arr[0];
        int sum = arr[0];
        for(int i=1; i<arr.length; i++){
            if( sum >= 0){
                sum += arr[i];
            }else{
                sum = arr[i];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
