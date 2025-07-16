package basic;

// 양꼬치
// 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 준다.
// 양꼬치는 1인분에 12,000원, 음료수는 2,000원 이다.
// 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n 인분과 음료수 k 개를 먹었다면
// 총 얼마를 지불해야 하는지 return 하도록 solution 함수를 작성
// 제한사항
// 0< n < 1,000
// n/10 <= k < 1,000
// 서비스로 받은 음료수는 모두 마신다.
public class Application7 {
    public static void main(String[] args) {
        int n = 20;
        int k = 3;
        Application7 app7 = new Application7();
        System.out.println(app7.solution(n, k));
        System.out.println(app7.solution1(n, k));
        System.out.println(app7.soulution2(n, k));
    }
    public int solution(int n, int k) {
        int answer = n/10;
        return (n > 9 && n/10 > 0)? n * 12000 + (k-answer) * 2000 :
                n * 12000 + k * 2000;
    }

    // 다른 풀이
    public int solution1(int n, int k) {
        k -= n/10;
        n *= 12000;
        k *= 2000;
        return n + k;
    }

    // 다른 풀이
    public int soulution2(int n, int k) {
        return n * 12000 + (k-n/10) * 2000;
    }


}
