package basic;

import java.util.Scanner;

public class Application3 {
// 9번
    public static void main(String[] args) {

        Application3 app3 = new Application3();
        app3.ninePractice();
    }

    public void ninePractice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.print("태어난 달을 입력하세요.( 1월 ~ 12월 ) : ");
        int month = sc.nextInt();
        System.out.print("태어난 날을 입력하세요.( 1일 ~ 31일 ) : ");
        int day = sc.nextInt();
        String gift = "";

        if(month < 7) {
            if(day < 16) {
                gift += "배민 쿠폰";
            } else if(month > 6) {
                if(day > 15) {
                    gift += "스타벅스 커피";
                }
            }
        } else {
            gift += "사탕";
        }

        System.out.println(name + "의 선물은 " + gift + "입니다.");
    }
}
