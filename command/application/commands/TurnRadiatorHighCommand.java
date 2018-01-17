package command.application.commands;

import command.application.Light;
import command.application.Radiator;

public class TurnRadiatorHighCommand implements Command{

    Radiator radiator;

    Radiator previousState;

    public TurnRadiatorHighCommand(Radiator radiator){
        this.radiator = radiator;
        this.previousState = null;
    }

    @Override
    public void execute() {
        previousState = new Radiator(radiator.getTargetTemperature());
        radiator.setTargetTemperature(25);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        radiator.setTargetTemperature(previousState.getTargetTemperature());
    }
}
