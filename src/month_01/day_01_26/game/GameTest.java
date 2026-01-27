package month_01.day_01_26.game;

public class GameTest {
    public static void main(String[] args) {
        Movable[] movables = {
                new Player("전사", 50),
                new Monster("슬라임", 100),
                new Player("마법사", 70)
        };

        System.out.println("=== 게임 캐릭터 이동 ===");
        for (Movable m : movables) {
            m.move(10, 20);
        }

        System.out.println("\n=== 게임 캐릭터 공격 ===");
        Attackable[] attackables = {
                new Player("전사", 50),
                new Monster("골렘", 200)
        };

        for (Attackable a : attackables) {
            a.attack("적");
        }
    }
}
