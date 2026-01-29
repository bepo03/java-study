package month_01.day_01_29;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phone) {
        this.contacts.put(name, phone);
        System.out.printf("%s 추가됨\n", name);
    }

    public String findPhone(String name) {
        return this.contacts.getOrDefault(name, "등록되지 않은 연락쳐");
    }

    public void removeContact(String name) {
        if (this.contacts.remove(name) != null) {
            System.out.printf("%s 삭제됨\n", name);
        }
    }

    public void printAll() {
        System.out.println("=== 전화번호부 ===");
        this.contacts.forEach((name, phone) ->
                System.out.printf("%s: %s\n", name, phone));
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.addContact("홍길동", "010-1234-5678");
        book.addContact("김영희", "010-9876-5432");
        book.addContact("이철수", "010-1111-2222");

        book.printAll();

        System.out.printf("\n검색: %s\n", book.findPhone("김영희"));

        book.removeContact("이철수");
        book.printAll();
    }
}
