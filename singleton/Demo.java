package singleton;

import singleton.application.SimpleSingleton;

public class Demo {

    public static void main(String[] args) {
        SimpleSingleton instanceOne = SimpleSingleton.getInstance();
        SimpleSingleton instanceTwo = SimpleSingleton.getInstance();
        if (instanceOne.equals(instanceTwo)) {
            System.out.println("----------------------------------");
            System.out.println("Stai utilizzando la stessa istanza");
            System.out.println("----------------------------------");
        }
    }

    private void createSameInstance() {
        for (int i = 0; i < 10; i++) {
            final int b = i;
            Runnable task = () -> {
                SimpleSingleton instance = SimpleSingleton.getInstance();
                System.out.println("Numero thread: " + b + " Istanza: "+instance);
            };
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
