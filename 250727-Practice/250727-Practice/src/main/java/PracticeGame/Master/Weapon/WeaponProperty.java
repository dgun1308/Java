package PracticeGame.Master.Weapon;

public abstract class WeaponProperty {

    private String name;
    private int attackDamage;

    // 무기의 이름과 공격력을 생성하는 생성자
    // 클래스명 == 메서드명 : 생성자
    // 클래스명 != 메서드명 : 메서드
    public WeaponProperty(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    // 모든 무기의 정보를 보여주는 메서드
    public void getInfo() {
        System.out.println("무기 이름 : " + this.name + ", 공격력 : " + this.attackDamage);
    }
}
