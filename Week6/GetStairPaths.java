import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n<0){
            ArrayList<String> emp = new ArrayList<>();
            return emp;
        }
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> faith1 = getStairPaths(n-1);
        for(String str: faith1){
            res.add("1"+str);
        }
        ArrayList<String> faith2 = getStairPaths(n-2);
        for(String str: faith2){
            res.add("2"+str);
        }
        ArrayList<String> faith3 = getStairPaths(n-3);
        for(String str: faith3){
            res.add("3" + str);
        }
        return res;
        
    }

}