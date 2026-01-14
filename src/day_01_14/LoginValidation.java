package day_01_14;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("아이디: ");
//        String inputId = scanner.next();
//        System.out.print("비밀번호: ");
//        String inputPassword = scanner.next();
//
//        String correctId = "admin";
//        String correctPassword = "admin1234";
//
//        System.out.println("=== 방법 1: 중첩 if ===");
//
//        if (inputId.equals(correctId)) {
//            if (inputPassword.equals(correctPassword)) {
//                System.out.println("✅ 로그인 성공!");
//                System.out.println("환영합니다, " + inputId + "님!");
//            } else {
//                System.out.println("❌ 비밀번호가 틀렸습니다.");
//                System.out.println("비밀번호를 확인해주세요.");
//            }
//        } else {
//            System.out.println("❌ 존재하지 않는 아이디입니다.");
//            System.out.println("아이디를 확인해주세요.");
//        }
//
//        System.out.println("\n=== 방법 2: 논리 연산자 ===");
//
//        if (inputId.equals(correctId) && inputPassword.equals(correctPassword)) {
//            System.out.println("✅ 로그인 성공!");
//        } else {
//            System.out.println("❌ 로그인 실패!");
//        }

        System.out.println("\n=== 추가: 로그인 시도 횟수===");

        String inputId;
        String inputPassword;
        String correctId = "admin";
        String correctPassword = "admin1234";

        for (int attempts = 0; attempts < 5; attempts++) {
            System.out.print("아이디: ");
            inputId = scanner.next();
            System.out.print("비밀번호: ");
            inputPassword = scanner.next();

            if (inputId.equals(correctId) && inputPassword.equals(correctPassword)) {
                System.out.println("✅ 로그인 성공!");
            } else {
                System.out.println("❌ 로그인 실패!");
                if (attempts >= 4) {
                    System.out.println("🔒 계정이 잠겼습니다. 관리자에게 문의하세요.");
                } else if (attempts >= 2) {
                    System.out.println("⚠️ 로그인 시도 " + (attempts + 1) + "회 실패.");
                    System.out.println((4 - attempts) + "회 더 실패하면 계정이 잠깁니다.");
                } else {
                    System.out.println("로그인 시도 " + (attempts + 1) + "회 실패.");
                }
            }
        }
    }
}
