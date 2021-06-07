import java.uti.Scanner;

public class Solution {

    public static void main(String[] args) {

        //creating instance of scanner to read input from console
        Scanner s = new Scanner(System.in);

        //get input as long because of input is 10^15
        long number = s.nextLong(),temp_number = number;
        long reverse = 0;

        //Make loop that takes evey last digit and append it with the reverse
        while(number > 0){
            reverse = (reverse*10)+(number%10);
            number/=10;
        }

        //check the input number and reversed number if equal then it is palindrome
        //otherwise it is not

        if(temp_number==reverse) System.out.println("Yes");
        else System.out.println("No");
    }
}