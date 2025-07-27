package PracticeGame.Run;

import PracticeGame.Except.BbangSword;

public class RunApplication {

    public static void main(String[] args) {

        BbangSword b1 = new BbangSword("빵검", 100);
        b1.getInfo();
        b1.attack("사마귀");
    } // 똑똑이는 똑똑한 사마귀에요 똑똑이는 당랑권을 써요 똑똑이는 영어공부를 헤요 똑똑이는 벽을 탄답니다.
    // 나는 똑똑이 빵떡잉오 그렇군 하하하 똑똑이 빵엉이옹
}
