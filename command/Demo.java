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

        System.out.println("------- INIZIALE -------\n"+house.toString()+"--------------\n");
        invoker.addToCommandsQueue(new TurnLightsOnCommand(house.getKitchenLight()));
        invoker.addToCommandsQueue(new PutUpSomeMusicCommand(house.getBedRoomTelevision()));
        invoker.executeQueue();
        System.out.println("------- MUSICA + LUCE CUCINA -------\n"+house.toString()+"--------------\n");
        invoker.undoLatestCommand();
        System.out.println("------- LUCE CUCINA -------\n"+house.toString()+"--------------\n");
        invoker.addToCommandsQueue(new TurnRadiatorHighCommand(house.getBathRoomRadiator()));
        invoker.executeQueue();
        System.out.println("------- LUCE CUCINA + TERMOSIFONE BAGNO-------\n"+house.toString()+"--------------\n");
        invoker.undoEverything();
        System.out.println("------- INIZIALE -------\n"+house.toString()+"--------------\n");
    }

}
