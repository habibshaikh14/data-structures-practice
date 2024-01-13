package sandbox;

public class PracticeShortcuts {
    int health;
    int speed;
    int direction;
    String name;

    public PracticeShortcuts(int health, int speed, int direction, String name) {
        this.health = health;
        this.speed = speed;
        this.direction = direction;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }
}
