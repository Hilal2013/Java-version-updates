package m1_generics;

public abstract class Player {//im gonna create my  custom class
// main purpose of putting abstract//im not gonna create object
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
