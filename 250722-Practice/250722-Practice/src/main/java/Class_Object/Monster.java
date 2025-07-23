package Class_Object;

import org.w3c.dom.ls.LSOutput;

public class Monster {

    private int hp = 100;
    private int msAP;

    public int getHp() {
        return hp;
    }

    public void setMsAP(int msAP) {
        this.msAP = msAP;
    }

    public int getMsAP() {
        return msAP;
    }

    public void attack() {
        System.out.println("몬스터가 공격합니다.");
    }

}
