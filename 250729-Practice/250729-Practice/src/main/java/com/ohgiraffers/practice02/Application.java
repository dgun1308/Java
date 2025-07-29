package com.ohgiraffers.practice02;

public class Application {

    public static void main(String[] args) {

        SimpleOperations s = new SimpleOperations();

        s.printMessage();

        int start = 5;
        int end = 9;
        int result = s.sumNumbers(start, end);
        System.out.println(start + "부터" + end + "까지의 숫자들의 합은 : " + result);

        int num = 11;
        boolean b = s.isEvenNumber(num);
        if(b) {
            System.out.println(num + "은(는) 짝수입니다.");
        } else {
            System.out.println(num + "은(는) 홀수입니다.");
        }

        String input = "apple";
        char ch = 'p';
        System.out.println("\"" + input + "\"에서 \'" + ch + "\'의 개수는 : " + s.countCharacter(input, ch));

        System.out.println("\"" + input + "\"을(를) 뒤집은 결과는 : " + s.reverseString(input));
        System.out.println("\"" + input + "\"을(를) 뒤집은 결과는 : " + s.reverseString1(input));
    }
}
