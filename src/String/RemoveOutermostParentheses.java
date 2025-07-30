package String;

//A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
//        For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//        A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
//        Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
//        Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
//        Example 1:
//
//        Input: s = "(()())(())"
//        Output: "()()()"
//        Explanation:
//        The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//        After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//        Example 2:
//
//        Input: s = "(()())(())(()(()))"
//        Output: "()()()()(())"
//        Explanation:
//        The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//        After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//        Example 3:
//
//        Input: s = "()()"
//        Output: ""
//        Explanation:
//        The input string is "()()", with primitive decomposition "()" + "()".
//        After removing outer parentheses of each part, this is "" + "" = "".

public class RemoveOutermostParentheses {
    public static void main(String[] args){
        String s = "(()())(())";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==')') count--;
            if(count!=0) sb.append(s.charAt(i));
            if(s.charAt(i)=='(') count++;
        }
        System.out.println(sb.toString());
    }
}
