package com.ohgiraffers.practice01.Calculator.java;

import java.util.Scanner;

public class Calculator {

    public void checkMethod() {
        System.out.println("메서드 호출 확인");

    }

    public int sum1to10() {
        int num = 0;
        int sum = 0;
        for(num=1; num<11; num++) {
            sum += num;
        }
        return sum;
    }

    public void checkMaxNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("두 수 중 큰 수는 " + a + "이다.");
        } else {
            System.out.println("두 수 중 큰 수는 "+ b + "이다.");
        }
    }

    public int sumTwoNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        int b = sc.nextInt();
        System.out.print(a + "과 " + b + "의 합은 : ");
        return a + b;
    }

    public int minusTwoNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int a = sc.nextInt();
        System.out.print("숫자 2 : ");
        int b = sc.nextInt();
        System.out.print(a + "과 " + b + "의 차는 : ");
        return a - b;
    }
}
