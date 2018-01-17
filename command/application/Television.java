package command.application;

public class Television {

    private int currentChannel;
    private int volume;
    private boolean on;

    public Television(int currentChannel, int volume, boolean on) {
        this.currentChannel = currentChannel;
        this.volume = volume;
        this.on = on;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "    television:\n" +
               "        on="+on+"\n"+
               "        channel="+currentChannel+"\n"+
               "        volume="+volume+"\n";

    }
}
