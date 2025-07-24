package programmers;

// 정수 배열 numbers 가 매개변수로 주어집니다.
// numbers 의 원소의 평균값을 return 하도록
// solution 함수를 완성해주세요.
// 제한사항
// 0 <= numbers 의 원소 <= 1,000
// 1 <= numbers 의 길이 <= 100
// 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

public class Application2 {

    public static void main(String[] args) {

        Application2 app2 = new Application2();
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(app2.solution(numbers));
        System.out.println(app2.solution1(numbers));
    }

    public double solution(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum/numbers.length;
    }

    public double solution1(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return (double) sum/numbers.length;
    }
}
