/**
 * Created by roger on 12/09/17.
 */
public class SingletonDriver {
    private static SingletonDriver ourInstance = new SingletonDriver();

    public static SingletonDriver getInstance() {
        return ourInstance;
    }

    private SingletonDriver() {
    }


}
