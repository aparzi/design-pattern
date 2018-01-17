package command.application.commands;

import command.application.Television;

public class PutUpSomeMusicCommand implements Command{

    Television television;

    Television previousState;

    public PutUpSomeMusicCommand(Television television){
        this.television = television;
        this.previousState = null;
    }

    @Override
    public void execute() {
        previousState = new Television(television.getCurrentChannel(), television.getVolume(), television.isOn());
        television.setCurrentChannel(10);
        television.setVolume(50); // Music channel
        television.setOn(true);
    }

    @Override
    public void undo() {
        if(previousState == null)
            return;
        television.setVolume(previousState.getVolume());
        television.setOn(previousState.isOn());
        television.setCurrentChannel(previousState.getCurrentChannel());
    }
}
