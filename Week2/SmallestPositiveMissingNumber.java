package Week2;
import java.util.*;
public class SmallestPositiveMissingNumber {
    
        // Function to find 
        public static int findMissing(int arr[], int size)
        {
           
           // Your code here
           ArrayList<Integer> ar = new ArrayList<>();
           for(int val: arr){
               if(val>0){
                   ar.add(val);
               }
           }
           Collections.sort(ar);
           int ans = 1;
           for(int i=0; i<ar.size(); i++){
               
               int val = ar.get(i);
               if(val==ans){
                   ans++;
               }
               else if(val>ans){
                   return ans;
               }else{
                  continue;
               }
               
           }
           return ans;
           
           
        }
    
}
