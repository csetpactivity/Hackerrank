import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Size of the array.
        int n = s.nextInt();
        // Array elements
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = s.nextInt();
        // Value is to inserted
        int val = s.nextInt();
        
        int left = 0, right = arr.length - 1;
        // Index we need to find.
        int index = -1;
        
        for(int i = 0; i < n; i++) {
            if(val <= arr[i]) {
                index = i;
                break;
            }
        }
        
        if(index == -1) System.out.println(n);
        else System.out.println(index);
    }
}