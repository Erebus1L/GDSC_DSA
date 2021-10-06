import java.util.*;

class FirstRepeatingElement{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        Solution ob = new Solution();
        System.out.println(ob.firstRepeated(arr, n));
        
    }
}

class Solution{
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val:arr){
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val, 1);
            }
        }
        for(int i=0; i<n; i++){
            if(map.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
        
        
    }
}