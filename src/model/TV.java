package model;

public class TV extends DeviceBase {
    private boolean smart;

    public TV() {
        this.smart = false;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String getStatus() {
        return String.format("TV Status - Smart: %s, %s", smart ? "YES" : "NO", super.getStatus());
    }
}