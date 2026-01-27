package month_01.day_01_14;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요일번호를 입력해주세요(월요일은 1): ");

        int day;
        String dayName = switch (day = scanner.nextInt()) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "잘못된 입력";
        };

        System.out.println("오늘은 " + dayName + "입니다.");

        if (day >= 1 && day <= 5) {
            System.out.println("평일 입니다. 열심히 공부하세요!");
        } else if (day == 6 || day == 7) {
            System.out.println("주말 입니다. 푹 쉬세요!");
        } else {
            System.out.println("올바른 요일 번호를 입력하세요.(1-7)");
        }
    }
}
