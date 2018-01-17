package singleton.application;

public class SyncronizedSingleton {

    private static SyncronizedSingleton instance;

    /**
     * Each thread has to wait its turn before it can enter the method.
     * Two thread can't enter the method at the same time.
     * @return SyncronizedSingleton
     */
    public synchronized static SyncronizedSingleton getInstance() {
        if (instance == null)
            instance = new SyncronizedSingleton();
        return instance;
    }

    private SyncronizedSingleton() {
    }
}
