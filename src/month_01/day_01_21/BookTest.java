package month_01.day_01_21;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("1234", "돈의 방정식", "모건 하우절", 25_200);

        book.showInfo();

        System.out.println("\n=== 대출 ===");
        book.borrow();

        System.out.println("\n=== 반납 ===");
        book.returnBook();

        System.out.println("\n=== 가격 변경 ===");
        book.setPrice(35_000);

        book.showInfo();

        System.out.println("\n=== 유효성 검사 ===");
        book.setPrice(-1_000);
    }
}
