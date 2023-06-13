package recursion;

public class SubSequence {
    public static void mySubSeq(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;

        }
        char currChar = str.charAt(idx);

        // want to be added;
        mySubSeq(str, idx + 1, newString + currChar);

        // don't want to be added;
        mySubSeq(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        mySubSeq(str, 0, "");
        // for(int i=0; i<str.length(); i++){
        // System.out.println(str.charAt(i));

        // }
    }
}
