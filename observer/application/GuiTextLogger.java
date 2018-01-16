package observer.application;

public class GuiTextLogger implements Observer {

    GuiStatus guiStatus;

    String log;

    public GuiTextLogger(GuiStatus guiStatus){
        this.guiStatus = guiStatus;
        log = guiStatus.getTextAreaContent();
        guiStatus.registerObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        log += "\n"+guiStatus.getTextAreaContent();
        System.out.println("---------GUI TEXT LOGGER---------\n"+
                           log+"\n"+
                           "----------------------------------");
    }
}
