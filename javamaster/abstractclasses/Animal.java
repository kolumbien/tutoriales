package abstractclasses;

/**
 * Created by dev on 7/10/2015.
 */
public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
