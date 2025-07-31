package String;
//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//        Example 1:
//        Input: s = "egg", t = "add"
//        Output: true
//        Explanation:
//        The strings s and t can be made identical by:
//        Mapping 'e' to 'a'.
//        Mapping 'g' to 'd'.
//        Example 2:
//        Input: s = "foo", t = "bar"
//        Output: false
//        Explanation:
//        The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
//        Example 3:
//        Input: s = "paper", t = "title"
//        Output: true
public class IsomorphicStrings {
    public static void main(String[] args){
        String s = "paper", t = "title";
        System.out.println(check(s,t));
    }

    private static boolean check(String s, String t){
        int[] arr1 = new int[127];
        int[] arr2 = new int[127];

        for(int i = 0 ; i<s.length() ; i++){
            char a = s.charAt(i), b = t.charAt(i);
            if(arr1[a]!=arr2[b]) return false;
            arr1[a] = i+1;
            arr2[b] = i+1;
        }
        return true;
    }
}
