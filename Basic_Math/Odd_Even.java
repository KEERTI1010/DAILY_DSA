/*
Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

Examples:

Input: n = 15
Output: false
Explanation: The number is not divisible by 2, Odd number.

Input: n = 44
Output: true
Explanation: The number is divisible by 2, Even number.

Solution

class Solution {
    static boolean isEven(int n) {
        if(n % 2 == 0){
            return true;
        }
        else return false;
    }
}

*/

import java.util.Scanner;

public class Odd_Even {

    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isEven(n));
    }
}

