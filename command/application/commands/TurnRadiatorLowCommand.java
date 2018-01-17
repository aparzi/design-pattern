package command.application.commands;

import command.application.Radiator;

public class TurnRadiatorLowCommand implements Command{

    Radiator radiator;

    Radiator previousState;

    public TurnRadiatorLowCommand(Radiator radiator){
        this.radiator = radiator;
        this.previousState = null;
    }

    @Override
    public void execute() {
        previousState = new Radiator(radiator.getTargetTemperature());
        radiator.setTargetTemperature(15);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        radiator.setTargetTemperature(previousState.getTargetTemperature());
    }
}
