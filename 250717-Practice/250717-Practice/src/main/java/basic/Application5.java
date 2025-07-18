package basic;

import java.util.Scanner;

public class Application5 {
// 11번
    public static void main(String[] args) {
        Application5 app5 = new Application5();
        app5.elevenPractice();
    }

    public void elevenPractice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요? ( 1 ~ 10 ) : ");
        int num = sc.nextInt();

        if(num > 10) {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        } else if(num < 1) {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        } else if(num % 2 != 0) {
            System.out.println("홀수네요, 인형 선물입니다!");
        } else {
            System.out.println("짝수네요, 모자 선물입니다!");
        }
    }
}
