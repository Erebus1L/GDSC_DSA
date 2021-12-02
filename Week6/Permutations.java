import java.util.*;
class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        solve(ans, ds, freq, nums);
        return ans;
    }
    public void solve(List<List<Integer>> ans, List<Integer> ds, boolean[] freq, int[] nums){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                solve(ans, ds, freq, nums);
                ds.remove(ds.size()- 1);
                freq[i] = false;
            }
        }
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, nums, 0);
        return ans;
    }
    public void solve(List<List<Integer>> ans, int[] nums, int idx){
        if(idx==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=idx; i<nums.length; i++){
            swap(nums, i, idx);
            solve(ans, nums, idx+1);
            swap(nums, i, idx);
        }
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}