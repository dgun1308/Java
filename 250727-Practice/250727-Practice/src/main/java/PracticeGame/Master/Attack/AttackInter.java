package PracticeGame.Master.Attack;

// 공격 행위 인터페이스
public interface AttackInter {

    // 타겟을 공격하는 매개변수를 가진 추상메서드
    // 모든 무기 클래스에 attack(메서드)을 강제
    void attack(String target);
}
