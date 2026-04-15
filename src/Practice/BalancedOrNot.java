//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class BalancedOrNot {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Enter a line : ");
//        String a = br.readLine();
//        int f = 0;
//
//        for (int i = 0; i < a.length(); i++) {
//            char b = a.charAt(i);
//
//            if (b == '(') {
//                for (int j = 0; j < a.length(); j++) {
//                    char c = a.charAt(j);
//                    if (c == ')') {
//                        f = 1;
//                    } else {
//                        f = 0;
//                    }
//                }
//            }
//
//        }
//            if (f == 1) {
//                System.out.println("Balanced");
//            } else {
//                System.out.println("Not Balanced");
//            }
//        }
//
//}


import java.io.*;
import java.util.Stack;

public class BalancedOrNot {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a line: ");
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char top = stack.peek();

                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {

                    stack.pop();
                } else {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}