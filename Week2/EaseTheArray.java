package Week2;
import java.util.*;
class EaseTheArray{
    void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        if(n==1){
            return;
        }
        for(int i=0; i<n-1; i++){
            if(arr[i] == 0){
                continue;
            }
            else if(arr[i] == arr[i+1]){
                arr[i] = 2*arr[i];
                arr[i+1] = 0;
                i++;
            }
            
        }
        int count = 0;
        for(int val: arr){
            if(val!=0){
                arr[count] = val;
                count++;
            }
        }
        for(int i=count; i<n; i++){
            arr[i] = 0; 
        }
    }
}

