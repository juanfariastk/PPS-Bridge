package model;

public abstract class DeviceBase implements Device {
    private boolean enabled;
    private int volume;
    private int channel;

    public DeviceBase() {
        this.enabled = false;
        this.volume = 50;
        this.channel = 1;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel >= 1) {
            this.channel = channel;
        }
    }

    @Override
    public String getStatus() {
        return String.format("Volume: %d, Channel: %d, Power: %s", volume, channel, enabled ? "ON" : "OFF");
    }
}