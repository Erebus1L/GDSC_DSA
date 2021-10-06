import java.util.*;
public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        ArrayList<Integer> ans = leaders(arr, n);
        for(Integer val: ans){
            System.out.println(val);
        }

    }

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(st.peek() <= arr[i] ){
                st.push(arr[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(st.size()>0){
            ans.add(st.pop());
        }
        return ans;
    }
}
