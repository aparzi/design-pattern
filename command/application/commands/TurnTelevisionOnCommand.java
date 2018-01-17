package command.application.commands;

import command.application.Television;

public class TurnTelevisionOnCommand implements Command{

    Television television;

    Television previousState;

    public TurnTelevisionOnCommand(Television television){
        this.television = television;
        this.previousState = null;
    }

    @Override
    public void execute() {
        television.setOn(true);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        television.setOn(previousState.isOn());
    }
}
