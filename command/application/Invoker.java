package command.application;

import command.application.commands.Command;

import java.util.*;

public class Invoker {

    private Queue<Command> commandsQueue;
    private Stack<Command> commandsHistory;

    public Invoker() {
        commandsQueue = new LinkedList<>();
        commandsHistory = new Stack<>();
    }

    public void addToCommandsQueue(Command command){
        commandsQueue.add(command);
    }

    public void removeFromCommandsQueue(Command command){
        commandsQueue.remove(command);
    }

    public void executeQueue(){
        while(commandsQueue.size() > 0) {
            Command toExecute = commandsQueue.poll();
            toExecute.execute();
            commandsHistory.push(toExecute);
        }
    }

    public void undoLatestCommand(){
        if(!commandsHistory.empty())
            commandsHistory.pop().undo();
    }

    public void undoEverything(){
        while(commandsHistory.size() > 0)
            commandsHistory.pop().undo();
    }
}
