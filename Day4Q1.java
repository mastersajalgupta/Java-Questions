//1980. Find Unique Binary String

import java.util.*;

public class Day4Q1 {

    static class Solution {
        public String findDifferentBinaryString(String[] nums) {
            int n = nums.length;
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char c = nums[i].charAt(i);

                if (c == '0') {
                    res.append('1');
                } else {
                    res.append('0');
                }
            }

            return res.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nums = new String[n];

        System.out.println("Enter binary strings:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLine();
        }

        Solution obj = new Solution();
        String result = obj.findDifferentBinaryString(nums);

        System.out.println("Unique Binary String: " + result);
    }
}

// Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
// 
//  
// 
// Example 1:
// 
// Input: nums = ["01","10"]
// Output: "11"
// Explanation: "11" does not appear in nums. "00" would also be correct.
// Example 2:
// 
// Input: nums = ["00","01"]
// Output: "11"
// Explanation: "11" does not appear in nums. "10" would also be correct.
// Example 3:
// 
// Input: nums = ["111","011","001"]
// Output: "101"
// Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.