package Strings;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
//            System.out.print(ch);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
