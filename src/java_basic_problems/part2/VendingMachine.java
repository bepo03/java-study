package java_basic_problems.part2;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object [][] data = {
                {"콜라", 1100},
                {"사이다", 1000},
                {"커피", 1500},
                {"물", 800}
        };

        // 입력
        int money = 0, choice = 0;
        System.out.println("투입금액을 입력해주세요: ");
        money = scanner.nextInt();
        System.out.println("선택할 음료를 입력해주세요: ");
        choice = scanner.nextInt();

        // 출력
        System.out.println("===== 자판기 =====");
        System.out.println("\n[메뉴]");
        for(int i = 0; i < data.length; i++) {
            System.out.printf("%d. ", (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                if (j == 0) System.out.printf("%s - ", data[i][j]);
                else System.out.printf("%d원", (int) data[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n[주문 정보]");
        System.out.printf("투입 금액: %d원\n", money);
        System.out.printf("선택: %d번\n", choice);

        System.out.println("\n[결과]");
        if (choice >= 1 && choice <= data.length) {
            String selectChoice = (String) data[choice - 1][0];
            int selectMoney = (int) data[choice - 1][1];
            if (selectMoney <= money) {
                System.out.printf("%s를 구매했습니다.\n", selectChoice);
                System.out.printf("거스름돈: %d원\n", money - selectMoney);
            } else {
                System.out.println("금액이 부족합니다.");
                System.out.printf("부족한 금액: %d\n", selectMoney - money);
            }
        } else {
            System.out.println("잘못된 번호를 입력했습니다. (1~4 입력)");
            System.out.printf("입력값: %d\n", choice);

        }
    }
}
/*
데이터:
콜라 1100원
사이다 1000원
커피 1500원
물 800원

입력값:
2000
3
 */