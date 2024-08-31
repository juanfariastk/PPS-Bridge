package model;

public class AdvancedRemote extends RemoteBase {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
