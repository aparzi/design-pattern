package command.application;

public class Radiator {

    private float targetTemperature;

    public Radiator(float targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public float getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(float targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    @Override
    public String toString() {
        return "    radiator:\n" +
               "        targetTemp="+targetTemperature+"\n";
    }
}
