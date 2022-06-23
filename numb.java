import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 == 1){
            System.out.println("Weird");
        }
        else if (n%2 == 0 && 2<= n && n<= 5){
            System.out.println("Not Weird");
        }
        else if (n%2 == 0 && 6<=n && n<=20){
            System.out.println("Weird");
        }
        else if (n%2 == 0 && n >= 20){
            System.out.println("Not Weird");
        }
    }
}