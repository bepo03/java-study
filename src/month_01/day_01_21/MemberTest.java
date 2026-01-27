package month_01.day_01_21;

public class MemberTest {
    public static void main(String[] args) {
        Member user = new Member("user", "user1234", "user");
        user.showProfile();

        System.out.println("\n=== 이메일 등록 ===");
        user.setEmail("user@email.com");
        user.showProfile();

        System.out.println("\n=== 이름 등록 ===");
        user.setName("changeUser");
        user.showProfile();

        System.out.println("\n=== 암호 변경 ===");
        user.changePassword("user1234", "user12345");

        System.out.println("\n=== 로그인 ===");
        user.login("user12345");

        System.out.println("\n=== 유효성 검사 ===");
        user.setEmail("user");
        user.setName("");
        user.changePassword("user1234", "1234");
        user.changePassword("user12345", "123");
        user.login("");
    }
}
