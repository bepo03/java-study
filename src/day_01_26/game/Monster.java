package day_01_26.game;

public class Monster implements Movable, Attackable {
    private String type;
    private int hp;

    public Monster(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("%s 이(가) 배회 중...\n", this.type);
    }

    @Override
    public void stop() {
        System.out.printf("%s 대기\n", this.type);
    }

    @Override
    public void attack(String target) {
        System.out.printf("%s 이(가) %s 을(를) 공격!\n", this.type, target);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}
