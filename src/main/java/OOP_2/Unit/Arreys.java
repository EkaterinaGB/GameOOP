package OOP_2.Unit;

public class Arreys extends Character {
    int cartriges, distance;

    public Arreys(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int cartriges, int distance) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.cartriges = cartriges;
        this.distance = distance;
    }
}
