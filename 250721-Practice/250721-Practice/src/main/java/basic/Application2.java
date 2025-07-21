package basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

//        String[] arr = new String[5];
        Application2 app2 = new Application2();
        app2.Practice2();

    }

    public void Practice2() {
        String[] arr = {"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 4) {
            System.out.println("준비된 과일이 없습니다.");
        } else {
            System.out.println(arr[num]);
        }
    }
}
