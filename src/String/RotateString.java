package String;
//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//
//        A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//        For example, if s = "abcde", then it will be "bcdea" after one shift.
//        Example 1:
//        Input: s = "abcde", goal = "cdeab"
//        Output: true
//        Example 2:
//        Input: s = "abcde", goal = "abced"
//        Output: false

public class RotateString {
    public static void main(String[] args){
        String s = "abcde", goal = "cdeab";
        boolean ans = s.length() == goal.length() && (s+s).contains(goal);
        System.out.println(ans);
    }
}
