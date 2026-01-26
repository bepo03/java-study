package day_01_26.Media;

public interface Playable {
    void play();

    void pause();

    void stop();

    default void showStatus(String status) {
        System.out.printf("상태: %s\n", status);
    }
}
