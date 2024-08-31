package model;

public class Radio extends DeviceBase {
    private String modulation;

    public Radio() {
        this.modulation = "FM";
    }

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public String getStatus() {
        return String.format("Radio Status - Modulation: %s, %s", modulation, super.getStatus());
    }
}