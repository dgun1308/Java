package Class_Object;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 프로그램 개요
        // 전사가 몬스터와 전투하는 프로그램

        // 시스템 요구사항
        // 1. 전사는 무기 장착하기, 공격하기, hp 감소, 사망 할 수 있다.
        // 2. 몬스터는 hp 수치가 감소하면 전사를 공격 한다.
        // 3. 전사는 무기 없이 공격할 수 없다.
        // 4. 전사와 몬스터는 hp와 공격력 수치를 가지고 있다.
        // 5. 전사와 몬스터는 hp가 0이 되면 죽는다.
        // 6. 전사와 몬스터 중 하나가 사망하면 전투는 끝난다.
        // 7. 무기를 장착한 상태에서 무기를 다시 장착할 수 없다.

        // 프로그램 설계하기
        // 1. 필요한 객체
        // - 플레이어(사용자), 전사, 몬스터

        // 2. 객체간 상호작용
        // - 전사가 수신할 수 있는 메세지 (전사가 해야 하는 일)
        // - 1. 무기 장착하기
        // - 2. 공격하기
        // - 3. 회복하기

        // - 몬스터가 수신할 수 있는 메세지 (몬스터가 해야 하는 일)
        // - 1. hp 감소
        // - 2. 공격하기

        Warrior wr = new Warrior();
        Monster ms = new Monster();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======= 전투 프로그램 =======");
            System.out.println("1. 무기 장착하기");
            System.out.println("2. 공격하기");
            System.out.println("3. 회복하기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : wr.weaponEq(); break;
                case 2 : wr.attack();  break;
                case 3 : wr.heal(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("메뉴의 번호 중 선택하세요."); break;
            }

            if(no == 9) {
                break;
            }
        }

    }
}
