package basic;

import java.util.Scanner;
// 7번
public class Application1 {
    public static void main(String[] args) {

        Application1 app1 = new Application1();
        app1.sevenPractice();

    }

    public void sevenPractice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }
    }
}
