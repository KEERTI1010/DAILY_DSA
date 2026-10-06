//  Write a program to find the nth strong number

import java.util.Scanner;

public class NthStrong {

    public static boolean isStrong(int n) {

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit =temp % 10;
            int fact = 1;
            for (int i= 1; i<= digit; i++) {
                fact = fact * i;
            }
            sum= sum + fact;
            temp= temp / 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count= 0;
        int num =1;

        while (count < n) {
            if (isStrong(num)) {
                count++;
            }
            if (count == n) {
                System.out.println(num);
                break;
            }
            num++;
        }
        sc.close();
    }
}