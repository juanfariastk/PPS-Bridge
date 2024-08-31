import model.*;

public class ClientBridge {
    public void testDevice(Remote remote) {
        System.out.println("Testing device...");
        remote.togglePower();
        remote.volumeUp();
        remote.volumeDown();
        remote.channelUp();
        remote.channelDown();
        System.out.println("Device status: " + ((RemoteBase)remote).device.getStatus());
    }

    public static void main(String[] args) {
        ClientBridge clientBridge = new ClientBridge();

        //radio
        Device radio = new Radio();
        Remote basicRemote = new BasicRemote(radio);
        clientBridge.testDevice(basicRemote);
        System.out.println("Radio status: " + radio.getStatus());

        // TV
        Device tv = new TV();
        Remote advancedRemote = new AdvancedRemote(tv);
        clientBridge.testDevice(advancedRemote);
        System.out.println("TV status: " + tv.getStatus());
    }
}
