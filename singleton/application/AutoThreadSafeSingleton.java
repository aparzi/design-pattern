package singleton.application;

public class AutoThreadSafeSingleton {

    /**
     * Singleton's instance comes create at class-load time.
     */
    private static final AutoThreadSafeSingleton instance = new AutoThreadSafeSingleton();

    private AutoThreadSafeSingleton() {
    }

    /**
     * Runtime initialization and by default ThreadSafe
     * @return AutoThreadSafeSingleton instance
     */
    public static AutoThreadSafeSingleton getInstance() {
        return instance;
    }
}
