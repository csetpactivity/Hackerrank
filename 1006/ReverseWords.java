import java.util.*;

public class Solution {
        public static void main(String[] args) {
             //creating instance of scanner to get input from console
            Scanner s = new Scanner(System.in);
            //getting string from console
            String str = s.nextLine();
            //Individual words are seperated using split method
            String words[] = str.split(" ");
            //For each word reverse it and print it
            for (int i = 0; i < words.length; i++) 
            {
                  System.out.print(reverse(words[i].toCharArray())+" ");
            }
            
    }
    //reversing a string 
    public static String reverse(char[] str){
        int i=0,j=str.length-1;
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++; 
            j--;
        }
        return new String(str);
    }
}