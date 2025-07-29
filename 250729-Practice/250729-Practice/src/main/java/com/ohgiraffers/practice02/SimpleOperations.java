package com.ohgiraffers.practice02;

public class SimpleOperations {

    public void printMessage() {
        System.out.println("메소드 호출 확인");
    }

    public int sumNumbers(int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }
//        System.out.println(start + "부터" + end + "까지의 숫자들의 합은 : ");
        return sum;
    }

    public boolean isEvenNumber(int num) {

        boolean a;
        if(num%2 == 0) {
            a = true;
//            System.out.println(num + "은(는) 짝수입니다.");
        } else {
            a = false;
//            System.out.println(num + "은(는) 홀수입니다.");
        }

        return a;
    }

    public int countCharacter(String input, char ch) {
        int sum2 = 0;
        for(int i = 0; i < input.length(); i++) {
            if(ch == input.charAt(i)) {
                sum2 += 1;
            }
        }
//        System.out.print("\"" + input + "\"에서 \'" + ch + "\'의 개수는 : ");
        return sum2;
    }


    // StringBuilder 타입 사용
    public StringBuilder reverseString(String input) {

        StringBuilder sb1 = new StringBuilder(input);
        sb1.reverse();
//        System.out.print("\"" + input + "\"을(를) 뒤집은 결과는 : ");
        return sb1;
    }

    // toString 클래스 사용
    public String reverseString1(String input) {

        StringBuilder sb1 = new StringBuilder(input);
//        System.out.print("\"" + input + "\"을(를) 뒤집은 결과는 : ");
        return sb1.reverse().toString();
    }
}
