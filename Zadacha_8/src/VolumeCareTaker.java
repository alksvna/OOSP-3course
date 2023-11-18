import java.util.ArrayList;
import java.util.List;
public class VolumeCareTaker {
    private List<SavingVolume> saving = new ArrayList<>();

    public void addSaving(SavingVolume sav) {
        saving.add(sav);
    }

    public SavingVolume getSaving(int index) {
        return saving.get(index);
    }
}
