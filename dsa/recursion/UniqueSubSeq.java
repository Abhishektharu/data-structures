package recursion;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubSeq {
    public static void mySubSeq(String str, int idx, String newString, Set<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
            }
            System.out.println(newString);
            return;

        }
        char currChar = str.charAt(idx);

        // want to be added;
        mySubSeq(str, idx + 1, newString + currChar, set);

        // don't want to be added;
        mySubSeq(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        mySubSeq(str, 0, "", set);
        // for(int i=0; i<str.length(); i++){
        // System.out.println(str.charAt(i));

        // }
    }
}
