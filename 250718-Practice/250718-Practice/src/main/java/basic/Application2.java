package basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Application2 app2 = new Application2();
        app2.Practice2();

    }

    public void Practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1 부터 " + num + " 까지의 합 : " + sum);
    }
}
