import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //creating instance of scanner to get input from console
        Scanner s = new Scanner(System.in);
        //getting size of array numbers
        int n = s.nextInt();
        //creating array
        int nums[] = new int[n];
        //getting array elements
        for(int i=0;i<n;i++) nums[i] = s.nextInt();
        //getting value to find sum of pair
        int target = s.nextInt();
        //looping for each element with every other element next to it to find pair gives sum
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //if this pairs gives the sum print and break the loop
                if(nums[i]+nums[j]==target) {
                    System.out.println(nums[i]+" "+nums[j]);
                    break;
                }
            }
        }
    }
}