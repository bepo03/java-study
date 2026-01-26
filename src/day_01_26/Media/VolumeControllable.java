package day_01_26.Media;

interface VolumeControllable {
    void volumeUp();

    void volumeDown();

    int getVolume();

    default void mute() {
        System.out.println("음소거");
    }
}
