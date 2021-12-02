public class Pallindrome {
    class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int num = n;
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        n = num;
        int[] nums = new int[count];
        while(n>0){
            nums[count-1] = n%10;
            n/=10;
            count--;
        }
        int i = 0;
        int j = nums.length-1;
        int div = 1;
        while(i<j){
            if(nums[i] != nums[j]){
                return "No";
            }
            i++;
            j--;
        }
        return "Yes";
    }
}
}
