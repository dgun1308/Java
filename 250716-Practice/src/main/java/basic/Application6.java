package basic;

// 각에서 0도 초과 90도 미만은 예각, 90도는 직각,
// 90도 초과 180도 미만은 둔각, 180도는 평각으로 분류한다.
// 각 angle이 매개변수로 주어질 때
// 예각 1, 직각 2, 둔각 3, 평각 4를 ruturn 하도록 solution 함수를 작성
// 제한사항
// 0 < angle <= 180
// angle은 정수
public class Application6 {
    public static void main(String[] args) {
        int angle = 70;
        Application6 app6 = new Application6();
        System.out.println(app6.solution(angle));
    }
    public int solution(int angle) {
        return (angle > 0 && angle < 90)? 1 :
                (angle == 90)? 2 :
                        (angle > 90 && angle < 180)? 3 :
                                (angle == 180)? 4 : 5;
    }
}
