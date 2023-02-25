package OOP_2.Unit;

public class Outlaw extends Character{/*Разбойник*/
    public Outlaw(String name, int x, int y) {
        super(name, 6, 10, 3, 2, 4, x, y, 8);
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    @Override
    public String toString() {
        return String.format("Разбойник: %4s  |  HP: %d  |  Speed: %d  |  ATK: %d-%d  |  DEF: %d  |  (X,Y): (%d,%d)\n", this.name, this.hp, this.speed, this.damegeMin, this.damegeMax, this.def, this.pos.x, this.pos.y);
    }
}
