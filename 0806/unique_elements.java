import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Size of the array
        int n = s.nextInt();
        //Elements of the array
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++) arr[i] = s.nextInt();
        //For counting unique elements
        int unique = 0;
        
        for(int i = 0; i < n; i++) {
            //Counting the occurance of the number.
            int count = 0;
            for(int j = 0; j < n; j++) {
                //Checking the number with all the other elements.
                if(i != j && arr[i] == arr[j]) count++;
            }
            //if the element exists only once
            if(count == 0) unique++;
        }
        System.out.println(unique);
    }
}