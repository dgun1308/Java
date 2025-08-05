package com.dgGame.model;

public class Player {

    private String name;
    private int hp;
    private int maxHp;
    private int attackPower;

    public Player(String name, int hp, int maxHp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
