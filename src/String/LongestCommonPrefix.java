package String;

import java.util.Arrays;

//Write a function to find the longest common prefix string amongst an array of strings.
//        If there is no common prefix, return an empty string "".
//        Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str = {"flower","flow","flight"};
        Arrays.sort(str);
        String str1 = str[0], str2 = str[str.length-1];
        int len = str1.length()>str2.length()?
                str2.length():str1.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(str1.charAt(i)!=str2.charAt(i)) break;
            sb.append(str1.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
