import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Size of the array
        int m = s.nextInt();
        int n = s.nextInt();
        //Elements of the array
        char arr[][] = new char[m][n];
        for(int i = 0; i < m ; i++) {
            for(int j = 0; j < n ; j++) {
                arr[i][j] = '#';
            }
        }
        for(int i = 0; i < m ; i++) {
            for(int j = 0; j < n ; j++) {
                if(j == n-1) System.out.print(arr[i][j]);
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}