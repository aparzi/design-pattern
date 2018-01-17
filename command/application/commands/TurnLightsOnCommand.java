package command.application.commands;

import command.application.Light;
import command.application.Television;

public class TurnLightsOnCommand implements Command{

    Light light;

    Light previousState;

    public TurnLightsOnCommand(Light light){
        this.light = light;
        this.previousState = null;
    }

    @Override
    public void execute() {
        previousState = new Light(light.isOn());
        light.setOn(true);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        light.setOn(previousState.isOn());
    }
}
