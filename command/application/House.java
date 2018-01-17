package command.application;

public class House {

    private Light kitchenLight, bathRoomLight, bedRoomLight;
    private Radiator bedRoomRadiator, bathRoomRadiator;

    public Light getKitchenLight() {
        return kitchenLight;
    }

    public void setKitchenLight(Light kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public Light getBathRoomLight() {
        return bathRoomLight;
    }

    public void setBathRoomLight(Light bathRoomLight) {
        this.bathRoomLight = bathRoomLight;
    }

    public Light getBedRoomLight() {
        return bedRoomLight;
    }

    public void setBedRoomLight(Light bedRoomLight) {
        this.bedRoomLight = bedRoomLight;
    }

    public Radiator getBedRoomRadiator() {
        return bedRoomRadiator;
    }

    public void setBedRoomRadiator(Radiator bedRoomRadiator) {
        this.bedRoomRadiator = bedRoomRadiator;
    }

    public Radiator getBathRoomRadiator() {
        return bathRoomRadiator;
    }

    public void setBathRoomRadiator(Radiator bathRoomRadiator) {
        this.bathRoomRadiator = bathRoomRadiator;
    }

    public Television getBedRoomTelevision() {
        return bedRoomTelevision;
    }

    public void setBedRoomTelevision(Television bedRoomTelevision) {
        this.bedRoomTelevision = bedRoomTelevision;
    }

    private Television bedRoomTelevision;

    public House() {
        kitchenLight = new Light(false);
        bathRoomLight = new Light(false);
        bedRoomLight = new Light(false);

        bedRoomRadiator = new Radiator(18);
        bathRoomRadiator = new Radiator(18);

        bedRoomTelevision = new Television(5, 10, false);
    }

    @Override
    public String toString() {
        return ""+
                "HOUSE STATUS\n\n"+
                "KITCHEN:\n"+
                kitchenLight.toString()+
                "BATHROOM:\n"+
                bathRoomLight.toString()+
                bathRoomRadiator.toString()+
                "BEDROOM:\n"+
                bedRoomLight.toString()+
                bedRoomRadiator.toString()+
                bedRoomTelevision.toString();
    }
}
