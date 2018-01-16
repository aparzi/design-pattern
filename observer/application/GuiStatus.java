package observer.application;

public class GuiStatus extends ObservableBase {

    private boolean toggleButtonValue;
    private String textAreaContent;
    private int sliderValue;

    public GuiStatus() {
        super();
        toggleButtonValue = false;
        textAreaContent = "First text";
        sliderValue = 50;
    }

    public void executeRandomOperations(){
        toggleButtonValue = (!(Math.random() < 0.5f));
        textAreaContent = String.format("New string %f generated", Math.random()*1000);
        sliderValue = (int) (50 * Math.random());
        notifyObservers();
    }

    public boolean isToggleButtonValue() {
        return toggleButtonValue;
    }

    public String getTextAreaContent() {
        return textAreaContent;
    }

    public int getSliderValue() {
        return sliderValue;
    }
}
