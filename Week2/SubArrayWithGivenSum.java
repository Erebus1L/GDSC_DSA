package Week2;
import java.util.*;
public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int si = 0;
        int ei = 0;
        int sum = 0;
        while(ei<n){
            sum += arr[ei]; 
            while(sum>s){
                sum -= arr[si];
                si++;
            }
            if(sum == s){
                ans.add(si+1);
                ans.add(ei+1);
                return ans;
            }
            ei++;
        }
        if(ans.size() == 0){
            ans.add(-1);
        }
        return ans;
        
    }
}
