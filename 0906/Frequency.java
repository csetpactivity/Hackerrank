import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Creating instance of scanner to read input from console
        Scanner s = new Scanner(System.in);
        //using nextLine() because the given string contains white spaces
        char[] str = s.nextLine().toCharArray();
        //creating new string for result
        String res = "";
        int n = str.length;
        //searching for each character in an array
        //if it finds then increase count and make that character as 0 to omit on next traversal
        for(int i=0;i<n;i++){
            int count = 1;
            char ch = str[i];
            for(int j=i+1;j<n;j++){
                if(ch==str[j]) {
                    count++;
                    str[j] = '0';
                }
            }
            //if the char is not a space or 0 then append it to result 
            if(ch!='0' && ch!=' ') res+=""+ch+count;
        }
        //print the res
        System.out.println(res);
    }
}