package command.application.commands;

import command.application.Light;

public class TurnLightsOffCommand implements Command{

    Light light;

    Light previousState;

    public TurnLightsOffCommand(Light light){
        this.light = light;
        this.previousState = null;
    }

    @Override
    public void execute() {
        previousState = new Light(light.isOn());
        light.setOn(false);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        light.setOn(previousState.isOn());
    }
}
