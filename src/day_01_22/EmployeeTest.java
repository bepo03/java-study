package day_01_22;

public class EmployeeTest {
    public static void main(String[] args) {
        Developer developer = new Developer("개발자", 2_000_000, "Java");
        Manager manager = new Manager("매니저", 2_400_000, 10);

        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║            개발자 정보            ║");
        System.out.println("╠═══════════════════════════════════╣");
        developer.showInfo();
        System.out.println("───────────────────────────────────────");
        developer.work();
        developer.debug();
        System.out.println("╚═══════════════════════════════════╝");


        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║            매니저 정보            ║");
        System.out.println("╠═══════════════════════════════════╣");
        manager.showInfo();
        System.out.println("───────────────────────────────────────");
        manager.work();
        System.out.println("╚═══════════════════════════════════╝");
    }
}
