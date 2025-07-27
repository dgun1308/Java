package PracticeGame.Except;

import PracticeGame.Master.Attack.AttackInter;
import PracticeGame.Master.Weapon.WeaponProperty;

public class BbangSword extends WeaponProperty implements AttackInter {

    // 무기의 속성(이름, 공격력)을 상속받는 생성자
    public BbangSword(String name, int attackDamage) {
        super(name, attackDamage);
    }

    // 공격 인터페이스를 상속받는 메서드(필수 구현)
    @Override
    public void attack(String target) {
        System.out.println(getName() + "으로" + target + "을 공격! 데미지 " + getAttackDamage());
    }
}
