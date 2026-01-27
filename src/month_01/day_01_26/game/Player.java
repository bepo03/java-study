package month_01.day_01_26.game;

class Player implements Movable, Attackable {
    private String name;
    private int x, y;
    private int damage;

    public Player(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("%s 이(가) (%d, %d)로 이동\n", this.name, this.x, this.y);
    }

    @Override
    public void stop() {
        System.out.printf("%s 정지\n", this.name);
    }

    @Override
    public void attack(String target) {
        System.out.printf("%s 이(가) %s 을(를) 공격! (데미지: %d)\n", this.name, target, this.damage);
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}
