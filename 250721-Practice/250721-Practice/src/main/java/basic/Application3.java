package basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Calculator app3 = new Calculator();
        app3.checkMethod();
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 10까지의 합 : " + app3.sum1to10());

        app3.checkMaxNumber();

        int result = app3.sumTwoNumber();
        System.out.println(result);

        int result2 = app3.minusTwoNumber();
        System.out.println(result2);

    }
}
