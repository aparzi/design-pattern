package observer;

import observer.application.GuiListener;
import observer.application.GuiStatus;
import observer.application.GuiTextLogger;

public class Demo {

    public static void main(String args[]){
        GuiStatus guiStatus = new GuiStatus();
        GuiListener  guiListener = new GuiListener(guiStatus);
        GuiTextLogger guiTextLogger = new GuiTextLogger(guiStatus);
        guiStatus.executeRandomOperations();
        guiStatus.executeRandomOperations();
        guiStatus.executeRandomOperations();
    }

}
