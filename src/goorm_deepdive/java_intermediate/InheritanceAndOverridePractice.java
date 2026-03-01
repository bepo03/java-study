package goorm_deepdive.java_intermediate;

import java.util.Scanner;

/**
 * 상속과 메서드 오버라이딩을 학습하여 코드 재사용성과 확장성을 이해합니다.
 * 직원/관리자 클래스를 작성하고 오버라이딩된 메서드를 확인합니다.
 *
 * \[해야 할 일\]
 *
 * - 직원 클래스 작성 (이름, 급여)
 * - 관리자 클래스 작성 (직책 추가, 직원 클래스 상속)
 * - toString() 메서드 오버라이딩
 * - 객체 생성 후 출력
 *
 * \[산출물\]
 *
 * - Java 소스 코드(.java)
 * - 실행 결과 요약 (예: “관리자: 이름=OO, 급여=OO, 직책=OO”)
 */
class Member {
    protected String name;
    protected Long pay;

    public Member(String name, Long pay) {
        this.name = name;
        this.pay = pay;
    };

    @Override
    public String toString() {
        return String.format("직원: 이름=%s, 급여=%,d", name, pay);
    }
}

class Manager extends Member {
    private final String position;

    public Manager(String name, Long pay, String position) {
        super(name, pay);
        this.name = name;
        this.pay = pay;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("관리자: 이름=%s, 급여=%,d, 직책=%s", name, pay, position);
    }
}
public class InheritanceAndOverridePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수에 입력값 넣기
        System.out.print("이름을 입력해주세요: ");
        String name = scanner.next();

        System.out.print("급여를 입력해주세요: ");
        Long pay = scanner.nextLong();

        System.out.print("직책을 입력해주세요: ");
        String position = scanner.next();

        Manager manager = new Manager(name, pay, position);
        System.out.println(manager);
    }
}
