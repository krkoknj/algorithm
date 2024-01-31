package parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.solution("(()()(()))()");
//        System.out.println("solution.solution(\"()()\") = " + solution.solution("(())()"));
//        solution.findStack("(())()");
        boolean b = solution.anotherPerson1("()()");
        System.out.println("b = " + b);
    }
}


class Solution {
    public boolean solution(String s) {
        boolean answer;

        answer = findFirstOpeningParenthesis(s);
//        checkCount(list);
        return answer;
    }

    public static boolean anotherPerson1(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }

        if (openCount == closeCount) {
            return true;
        }

        return false;
    }

    public static boolean findStack(String s) {
        char[] chars = s.toCharArray();
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }

        while (flag) {
            int count = 0;
            if (stack.pop() == ')') {
                count += 1;
            } else {
                for (int i = 0; i < count; i++) {

                }
            }


        }

        System.out.println("stack = " + stack);
        return false;
    }


    public static boolean findFirstOpeningParenthesis(String s) {
        boolean flag = true;
        boolean answer = true;
        String[] strArr = s.split("");
        List<String> list = new ArrayList<>(Arrays.asList(strArr));

        if (!(list.get(0).equals("(") && list.get(list.size() - 1).equals(")"))) {
            return false;
        }

        if (list.size() % 2 > 0) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("(")) {
                sum += 1;
            }
        }

        if (list.size() / 2 != sum) {
            return false;
        }



        return answer;
    }

    public static void checkCount(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("(")) {
                count += 1;
            }
        }

        System.out.println("list.size() % 2 = " + list.size() % 2);

        System.out.println("list.size() = " + list.size());
        System.out.println("count = " + count);
    }
}