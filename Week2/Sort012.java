package Week2;

import java.util.*;
class Sort012
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int i=0, j=0, k=n-1;
        while(i<=k){
            if(a[i] == 1){
                i++;
            }
            else if(a[i]== 0){
                swap(a, i, j);
                i++;
                j++;
            }
            else if(a[i] == 2){
                swap(a, i, k);
                k--;
            }
            
        }
        
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
