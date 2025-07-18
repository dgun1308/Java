package basic;

import java.util.Scanner;

public class Application2 {
// 8번
    public static void main(String[] args) {

        Application2 app2 = new Application2();
        app2.eightPractice();
    }

    public void eightPractice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }
    }
}
