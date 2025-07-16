package basic;

// 나머지 구하기
// 정수 num1, num2가 매개변수로 주어질 때,
// num1을 num2로 나눈 나머지를 return 하도록
// solution 함수를 작성
// 제한사항
// 0 < num1 <= 100
// 0 < num2 <= 100
public class Application4 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        Application4 app4 = new Application4();
        System.out.println(app4.solution(num1, num2));
    }
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}
