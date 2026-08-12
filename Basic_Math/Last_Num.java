/*

Given two integers a and b in the form of strings. Return the last digit of ab.

Examples:

Input: a = "3", b = "10"
Output: 9
Explanation: 310 = 59049. Last digit is 9.

Input: a = "6", b = "2"
Output: 6
Explanation: 62 = 36. Last digit is 6.

Constraints:
1 ≤ a.size(), b.size() ≤ 1000
a and b consist only of numeric digits ('0' - '9')
a and b do not contain any leading zeros, except when number itself is "0"

class Solution {
    public int getLastDigit(String a, String b) {
        int pow =(int) Math.pow(a,b);
        int last = pow/10;
        return last ;
    }
};

it will not works for this specific Question WHY BCZ .. I used Math.pow(a,b), but a and b 
are given as Strings, not normal numbers. Also, the numbers can be extremely big, so we can't
 convert them to int or double. Instead, we find the repeating pattern of the last digit and use
  that pattern to get the answer without calculating the whole power.”

*/