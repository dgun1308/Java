package Class_Object;

public class Warrior {
    private final Monster monster = new Monster();
    int monsterHp = monster.getHp();
    int monsterAP = monster.getMsAP();

    private boolean isWeapon;
    private int hp = 100;

    public void weaponEq() {
        if(isWeapon) {
            System.out.println("이미 무기를 장착하고 있습니다.");
        } else {
            this.isWeapon = true;
            System.out.println("무기를 장착했습니다.");
        }
    }

    public void attack() {
        if(isWeapon) {
            System.out.println("전사가 공격합니다.");
            this.monsterHp -= Math.random() * 10;
            System.out.println("현재 몬스터의 hp는 " + monsterHp + "입니다.");

            monster.attack();
            this.hp -= this.monsterAP;
            System.out.println("현재 전사의 hp는 " + this.hp + "입니다.");

        } else {
            System.out.println("무기를 장착하세요.");
        }
    }

    public void heal() {
        System.out.println("전사가 회복합니다.");
        this.hp += Math.random() * 11;
        System.out.println("현재 전사의 hp는 " + this.hp + "입니다.");

        System.out.println("몬스터가 공격합니다.");
        this.hp -= Math.random() * 9;
        System.out.println("현재 전사의 hp는 " + this.hp + "입니다.");

    }
}
