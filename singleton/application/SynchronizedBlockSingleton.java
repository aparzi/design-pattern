package singleton.application;

public class SynchronizedBlockSingleton {

    private static volatile SynchronizedBlockSingleton instance;

    private SynchronizedBlockSingleton() {
    }

    /**
     * With double-checked locking, we first check to see if an instance is created, and if not, then we
     * synchronize. Note: we only synchronize the first time.
     * @return SynchronizedBlockSingleton instance
     */
    private static SynchronizedBlockSingleton getInstance() {
        if (instance == null)
            synchronized (SynchronizedBlockSingleton.class) {
                if (instance == null)
                    instance = new SynchronizedBlockSingleton();
            }
        return instance;
    }
}
