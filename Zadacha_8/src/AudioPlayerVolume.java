public class AudioPlayerVolume {
    private int volumeLevel;

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }
    public SavingVolume saveVolumeLevel() {
        return new SavingVolume(volumeLevel);
    }

    public void restoreVolume(SavingVolume sav) {
        this.volumeLevel = sav.getVolume();

    }

    public void levelVolume() {
        System.out.println("Уровень громкости: " + volumeLevel);
    }
}
