package command.application;

public class Light {

    private boolean on;

    public Light(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "    light:\n" +
               "        on="+on+"\n";
    }
}
