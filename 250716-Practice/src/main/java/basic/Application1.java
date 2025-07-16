package basic;

public class Application1 {
// 4.
//
// 두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
// 두 수 중 큰 수를 출력하는 프로그램을 작성하세요.
//
// -- 출력예시 --
// 두 수 중 큰 수는 20입니다.
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Application1 app1 = new Application1();
        int bigNum = app1.bigNumMethod(num1, num2);
        System.out.println("두 수 중 큰 수는 " + bigNum + " 입니다.");

    }
    public int bigNumMethod(int num1, int num2) {
        int bigNum = (num2 > num1)? num2 : num1;
        return bigNum;
    }
}
