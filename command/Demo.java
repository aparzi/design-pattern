package command;


import command.application.House;
import command.application.Invoker;
import command.application.commands.PutUpSomeMusicCommand;
import command.application.commands.TurnLightsOnCommand;
import command.application.commands.TurnRadiatorHighCommand;

public class Demo {

    public static void main(String args[]){
        Invoker invoker = new Invoker();
        House house = new House();

        System.out.println("------- INITIAL STATUS -------\n"+house.toString()+"--------------\n");
        invoker.addToCommandsQueue(new TurnLightsOnCommand(house.getKitchenLight()));
        invoker.addToCommandsQueue(new PutUpSomeMusicCommand(house.getBedRoomTelevision()));
        invoker.executeQueue();
        System.out.println("------- MUSIC'S UP & KITCHEN LIGHT'S ON-------\n"+house.toString()+"--------------\n");
        invoker.undoLatestCommand();
        System.out.println("------- KITCHEN LIGHT'S ON -------\n"+house.toString()+"--------------\n");
        invoker.addToCommandsQueue(new TurnRadiatorHighCommand(house.getBathRoomRadiator()));
        invoker.executeQueue();
        System.out.println("------- KITCHEN LIGHT'S ON & BATHROOM RADIATOR'S ON-------\n"+house.toString()+"--------------\n");
        invoker.undoEverything();
        System.out.println("------- BACK TO INITIAL STATUS -------\n"+house.toString()+"--------------\n");
    }

}
