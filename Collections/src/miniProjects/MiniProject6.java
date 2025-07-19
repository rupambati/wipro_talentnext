package miniProjects;
import java.util.*;

public class MiniProject6 {

	public static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();

        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());
       
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String reversed = new StringBuilder(s2).reverse().toString();
            StringBuilder sb = new StringBuilder(s1);
            sb.replace(lastIndex, lastIndex + s2.length(), reversed);
            result.add(sb.toString());
        } else {
            result.add(s1 + s2);
        }

        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder sb = new StringBuilder(s1);
            sb.delete(firstIndex, firstIndex + s2.length());
            result.add(sb.toString());
        } else {
            result.add(s1);
        }
        int half = s2.length() / 2;
        int extra = s2.length() % 2;
        String firstHalf = s2.substring(0, half + extra);
        String secondHalf = s2.substring(half + extra);
        result.add(firstHalf + s1 + secondHalf);

        Set<Character> s2Chars = new HashSet<>();
        for (char ch : s2.toCharArray()) {
            s2Chars.add(ch);
        }
        StringBuilder op5 = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (s2Chars.contains(ch))
                op5.append('*');
            else
                op5.append(ch);
        }
        result.add(op5.toString());

        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("Output:");
        for (String str : output) {
            System.out.println("\"" + str + "\"");
        }

	}

}