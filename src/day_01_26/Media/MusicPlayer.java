package day_01_26.Media;

class MusicPlayer implements Playable, VolumeControllable {
    private String currentSong;
    private int volume = 50;
    private boolean isPlaying = false;

    public MusicPlayer(String currentSong) {
        this.currentSong = currentSong;
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.printf("재생: %s\n", this.currentSong);
        showStatus("재생 중");
    }

    @Override
    public void pause() {
        isPlaying = false;
        System.out.println("일시정지");
        showStatus("일시정지");
    }

    @Override
    public void stop() {
        isPlaying = false;
        System.out.println("정지");
        showStatus("정지됨");
    }

    @Override
    public void volumeUp() {
        if (volume < 100) {
            volume += 10;
        }
        System.out.printf("볼륨: %d\n", this.volume);
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume -= 10;
        }
        System.out.printf("볼륨: %d\n", this.volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public void changeSong(String currentSong) {
        this.currentSong = currentSong;
        System.out.printf("곡 변경: %s\n", this.currentSong);
    }
}
