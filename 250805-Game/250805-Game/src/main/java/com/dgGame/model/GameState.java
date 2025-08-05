package com.dgGame.model;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private Player player;
    private Player enemy;   // 몬스터도 Player 객체 재사용
    private List<String> messageLog;

    public GameState() {
        this.messageLog = new ArrayList<>();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getEnemy() {
        return enemy;
    }

    public void setEnemy(Player enemy) {
        this.enemy = enemy;
    }

    public List<String> getMessageLog() {
        return messageLog;
    }

    public void addMessage(List<String> messageLog) {
        this.messageLog = messageLog;
    }
}
