package day_01_21;

public class Member {
    private String id;
    private String password;
    private String name;
    private String email;

    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("올바른 이메일 형식이 아닙니다.");
            return;
        }

        this.email = email;
        System.out.printf("이메일이 등록되었습니다: %s\n", email);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("이름을 입력해주세요.");
            return;
        }

        this.name = name;
        System.out.printf("이름이 등록되었습니다: %s\n", name);
    }

    public boolean changePassword(String oldPw, String newPw) {
        if (!this.password.equals(oldPw)) {
            System.out.println("현재 비밀번호가 일치하지 않습니다.");
            return false;
        }

        if (newPw == null || newPw.length() < 4) {
            System.out.println("비밀번호는 4자리 이상이어야 합니다.");
            return false;
        }

        this.password = newPw;
        System.out.println("비밀번호가 변경되었습니다.");
        return true;
    }

    public boolean login(String inputPw) {
        if (this.password.equals(inputPw)) {
            System.out.printf("%s님, 로그인 성공!\n", getName());
            return true;
        }
        System.out.println("비밀번호가 일치하지 않습니다.");
        return false;
    }

    public void showProfile() {
        System.out.println("=== 회원 정보 ===");
        System.out.printf("ID: %s\n", getId());
        System.out.printf("이름: %s\n", getName());
        System.out.printf("이메일: %s\n", this.email != null ? this.email : "미등록");
    }
}
