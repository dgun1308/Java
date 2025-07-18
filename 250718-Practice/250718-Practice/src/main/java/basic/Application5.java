package basic;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        Application5 app5 = new Application5();
        app5.Practice5();

    }

    public void Practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);

            System.out.println(index + " : " + ch);

            index++;
        }
    }
}
