public class Example01 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("if 문");
        }
//        if ("String".toLowerCase().equals("string")) {
        if ("String".equalsIgnoreCase("string")) {
            System.out.println("true");
        }

        boolean isLogin = true;

        if (isLogin) {
            System.out.println("어서오세요. 고객님!");
        } else {
            System.out.println("로그인 해주세요!");
        }

//        int score = 80;
//        char grade;
//
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else if (score >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//
//        System.out.println("학점: " + grade);

        int score = 55;
        String result = "불합격";

        if (score >= 95) {
            result = "A등급 합격";
        } else if (score >= 80) {
            result = "B등급 합격";
        } else if (score >= 70) {
            result = "C등급 합격";
        } else if (score >= 60) {
            result = "D등급 합격";
        }

        System.out.println("결과: " + result);

        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            case 4:
                dayName = "목요일";
                break;
            case 5:
                dayName = "금요일";
                break;
            case 6:
                dayName = "토요일";
                break;
            case 7:
                dayName = "일요일";
                break;
            default:
                dayName = "잘못된 입력";
        }

        System.out.println("오늘은 " + dayName + "입니다.");

        int month = 7;
        String season;

        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 월";
        }

        System.out.println(month + "월은 " + season + "입니다.");

        String command = "stArT";

        switch (command.toLowerCase()) {
            case "start":
                System.out.println("시작합니다.");
                break;
            case "stop":
                System.out.println("중지합니다.");
                break;
            case "pause":
                System.out.println("일시정지합니다.");
                break;
            default:
                System.out.println("알 수 없는 명령입니다.");
        }

        String command2 = "StoP";

        String result2 = switch (command2.toLowerCase()) {
          case "start" -> "시작";
            case "stop"-> "중지";
            case "pause" -> "일시정지";
            default -> "알 수 없음";
        };

        System.out.println("명령어: " + result2);
    }
}
