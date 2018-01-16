package observer.application;

public class GuiListener implements Observer {

    GuiStatus guiStatus;

    public GuiListener(GuiStatus guiStatus){
        this.guiStatus = guiStatus;
    }

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("-------GUI LISTENER UPDATED-------\n"+
                           "toggleButton: "+guiStatus.isToggleButtonValue()+"\n"+
                           "textArea: "+guiStatus.getTextAreaContent()+"\n"+
                           "slider: "+guiStatus.getSliderValue()+"\n"+
                           "----------------------------------");
    }
}
