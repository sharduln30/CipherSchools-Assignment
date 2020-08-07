import java.util.Scanner;
import java.util.Stack;

class CipherSchools {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            System.out.println(isBalanced(str) ? "YES" : "NO");
        }
    }
    public static boolean isBalanced(String str) {
        Stack < Character > st = new Stack < > ();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.size() > 0 && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == '}') {
                if (st.size() > 0 && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == ']') {
                if (st.size() > 0 && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
        }
        if (st.size() == 0) return true;
        else return false;
    }
}