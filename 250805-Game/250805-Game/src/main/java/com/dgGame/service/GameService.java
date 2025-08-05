package com.dgGame.service;

import com.dgGame.model.GameState;
import com.dgGame.model.Player;

public class GameService {

    private GameState gameState;

    public GameService() {
        initializeGame();
    }

    // 게임 초기화
    public void initializeGame() {
        this.gameState = new GameState();
        Player player = new Player("용사", 100, 10);
        Player enemy = new Player("슬라임", 30, 5);
        this.gameState.setPlayer(player);
        this.gameState.setEnemy(enemy);
        this.gameState.addMessage("게임이 시작되었습니다. 슬라임이 나타났다!");
    }

    // 현재 게임 상태 반환
    public GameState getGameState() {
        return this.gameState;
    }

    // 플레이어의 공격 로직
    public GameState playerAttack() {
        Player player = gameState.getPlayer();
        Player enemy = gameState.getEnemy();

        if (player.getHp() <= 0) {
            gameState.addMessage("이미 쓰러져있습니다.");
            return gameState;
        }
        if (enemy.getHp() <= 0) {
            gameState.addMessage("이미 쓰러진 적입니다.");
            return gameState;
        }

        // 플레이어의 공격
        int playerDamage = player.getAttackPower();
        enemy.setHp(enemy.getHp() - playerDamage);
        gameState.addMessage(player.getName() + "이(가) " + enemy.getName() + "에게 " + playerDamage + "의 데미지를 입혔다!");

        // 적의 반격
        if (enemy.getHp() > 0) {
            int enemyDamage = enemy.getAttackPower();
            player.setHp(player.getHp() - enemyDamage);
            gameState.addMessage(enemy.getName() + "이(가) " + player.getName() + "에게 " + enemyDamage + "의 데미지를 입혔다!");
        } else {
            gameState.addMessage(enemy.getName() + "을(를) 물리쳤다!");
            // 여기에 새 몬스터를 등장시키는 로직을 추가할 수 있습니다.
        }

        if (player.getHp() <= 0) {
            gameState.addMessage(player.getName() + "이(가) 쓰러졌다... (GAME OVER)");
        }

        return gameState;
    }
}
