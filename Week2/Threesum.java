package Week2;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<> ();
        
        if(n<3){
            return ans;
        }
        Arrays.sort(arr);
        for(int i=0; i<=n-3; i++){
            int val = arr[i];
            int tar = 0-val;
            
            if(i!=0 && arr[i-1]==arr[i]){
                continue;
            }
            
            List<List<Integer>> subres = twoSum(arr, i+1, n-1, tar);
            for(List<Integer> s: subres){
                s.add(val);
                ans.add(s);
            }
        }
        return ans;
    }
    public List<List<Integer>> twoSum(int[] arr, int start, int end, int target){
        int left = start;
        int right = end;
        List<List<Integer>> ans = new ArrayList<>();
        while(left<right){
            if(left!=start && arr[left-1] == arr[left]){
                left++;
                continue;
            }
            int sum = arr[left] + arr[right];
            if(sum==target){
                List<Integer> sub = new ArrayList<>();
                sub.add(arr[left]);
                sub.add(arr[right]);
                ans.add(sub);
                left++;
                right--;
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}
