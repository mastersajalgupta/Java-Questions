class Day3Q1 {
    public boolean checkOnesSegment(String s) {
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '1' && s.charAt(i-1) == '0') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Day3Q1 obj = new Day3Q1();
        String s = "11000";
        System.out.println(obj.checkOnesSegment(s)); // Output: true
    }
}


// 1784. Check if Binary String Has at Most One Segment of Ones

// Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
// Example 1:
// Input: s = "1001"
// Output: false
// Explanation: The ones do not form a contiguous segment.
// Example 2:
// Input: s = "110"
// Output: true