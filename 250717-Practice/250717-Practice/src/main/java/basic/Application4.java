package basic;

import java.util.Scanner;

public class Application4 {
// 10번
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.tenPractice();
    }

    public void tenPractice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();

        if(age >= 20) {
            System.out.println("판매 가능합니다.");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }
}
