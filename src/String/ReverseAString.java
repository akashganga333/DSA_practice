package String;

public class ReverseAString {
    public static void main(String[] args){
        String s = " This is the best Coder   platform ";
        String[] str = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1 ; i>=0 ; i--){
            sb.append(str[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
