public class Main {
    public static void main(String[] args) {
        AudioPlayerVolume volume = new AudioPlayerVolume();
        VolumeCareTaker careTaker = new VolumeCareTaker();

        volume.setVolumeLevel(50);
        careTaker.addSaving(volume.saveVolumeLevel());

        volume.levelVolume();

        volume.setVolumeLevel(75);
        careTaker.addSaving(volume.saveVolumeLevel());

        volume.restoreVolume(careTaker.getSaving(1));

        volume.levelVolume();
    }
}