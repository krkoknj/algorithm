package binaryconversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("110010101001");
    }
}

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List lengthList = new ArrayList<>();
        List oneList = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                lengthList.add(s.charAt(i));
            } else {
                oneList.add(s.charAt(i));
            }
        }
        int target = lengthList.size();
        int count = 0;
        int quotient = 0; // 몫
        int remaining = 0; // 나머지
        boolean flag = true;
        while (quotient > 1) {
            quotient = target / 2;
            remaining = target % 2;
        }


        System.out.println("quotient = " + quotient);
        System.out.println("remaining = " + remaining);

        System.out.println("lengthList = " + lengthList);
        System.out.println("oneList = " + oneList);
        return answer;
    }
}