public class Day2Q1 {

    public int minOperations(String s) {
        int str0 = 0;
        int str1 = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Pattern starting with '0' -> 010101
            if(i % 2 == 0) {
                if(c != '0') str0++;
            } else {
                if(c != '1') str0++;
            }

            // Pattern starting with '1' -> 101010
            if(i % 2 == 0) {
                if(c != '1') str1++;
            } else {
                if(c != '0') str1++;
            }
        }

        return Math.min(str0, str1);
    }

    public static void main(String[] args) {
        Day2Q1 obj = new Day2Q1();   

        String s = "0100";
        int result = obj.minOperations(s);

        System.out.println("Minimum operations needed: " + result);
    }
}
 
// 1758. Minimum Changes To Make Alternating Binary String
// // You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change 
//any '0' to '1' or vice versa.
// 
// // The string is called alternating if no two adjacent characters are equal. For example, the string "010" is 
//alternating, while the string "0100" is not.
// Return the minimum number of operations needed to make s alternating.
// Example 1:
// Input: s = "0100"
// Output: 1
// Explanation: If you change the last character to '1', s will be "0101", which is alternating.
// Example 2:
// Input: s = "10"
// Output: 0
// Explanation: s is already alternating.
// Example 3:
// Input: s = "1111"
// Output: 2
// Explanation: You need two operations to reach "0101" or "1010".

