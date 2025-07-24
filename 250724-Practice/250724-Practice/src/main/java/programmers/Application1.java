package programmers;

// 정수 n 이 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성
// 제한사항 0 < n <= 1000

public class Application1 {

    public static void main(String[] args) {

        Application1 a1 = new Application1();

        int n = 10;
        System.out.println(a1.solution(n));
    }


    public int solution(int n) {
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
