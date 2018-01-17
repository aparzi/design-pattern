package command.application.commands;

import command.application.Television;

public class TurnTelevisionOffCommand implements Command{

    Television television;

    Television previousState;

    public TurnTelevisionOffCommand(Television television){
        this.television = television;
        this.previousState = null;
    }

    @Override
    public void execute() {
        television.setOn(false);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        television.setOn(previousState.isOn());
    }
}
