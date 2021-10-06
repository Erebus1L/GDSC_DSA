import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int n= scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            int d = scn.nextInt();
        scn.close();
        rotateArr(arr, d, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    //Function to rotate an array by d elements in counter-clockwise direction. 
    public static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int[] sh = new int[d];
        for(int i=0;i<d;i++){
            sh[i] = arr[i];
        }
        int j = 0;
        for(int i=d;i<n;i++){
            arr[j] = arr[i];
            j++;
        }
        int k = 0;
        for(int i=n-d; i<n && k<d; i++){
            arr[i] = sh[k];
            k++;
        }
        
    }

}
