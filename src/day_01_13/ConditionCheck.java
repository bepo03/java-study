package day_01_13;

public class ConditionCheck {
    public static void main(String[] args) {
        int age = 27;
        int score = 92;

        System.out.println("=== 비교 연산 ===");
        System.out.println("성인 여부 (age >= 18): " + (age >= 18));
        System.out.println("합격 여부 (score >= 60): " + (score >= 60));

        System.out.println("\n=== 논리 연산 ===");
        boolean canApply = (age >= 20) && (score >= 70);
        System.out.println("지원 가능 (20세 이상 AND 70점 이상): " + canApply);

        boolean getDiscount = (age < 20) || (age >= 65);
        System.out.println("할인 대상 (20세 미만 OR 65세 이상): " + getDiscount);

        System.out.println("\n=== 삼항 연산자 ===");
        String result = (score >= 60) ? "합격" : "불합격";
        System.out.println("결과: " + result);

        char grade = (score >= 90) ? 'A' :
                    (score >= 80) ? 'B' :
                    (score >= 70) ? 'C' :
                    (score >= 60) ? 'D' : 'F';

        System.out.println("학점: " + grade);
    }
}
