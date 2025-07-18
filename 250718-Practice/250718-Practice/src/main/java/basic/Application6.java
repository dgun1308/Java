package basic;

public class Application6 {

    // 6번
    // 반복문을 이용하여 알파벳 소문자 'a' 부터 'z'까지를 개행 없이 차례로 출력하세요.
    public static void main(String[] args) {

        Application6 app6 = new Application6();
        app6.Practice6();

    }

    public void Practice6() {
        System.out.print("======= 출력 : ");
        char ch = 97;
        while (ch <= 122) {

            System.out.print(ch);

            ch++;
        }
    }
}
