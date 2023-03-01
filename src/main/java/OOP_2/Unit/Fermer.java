package OOP_2.Unit;

import java.util.ArrayList;
import java.util.List;

public class Fermer extends Character {/*Крестьянин*/
    protected boolean delivery;

    public Fermer(String name, int x, int y) {
        super(name, 3, 1, 1, 1, 1, x, y, 1);
        this.delivery = true;
    }
    @Override
    public void step(ArrayList<Character> t1, ArrayList<Character> t2) {
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Фермер " + name + " освободился");
    }

    @Override
    public String getInfo() {
        return "Фермер";
    }

    @Override
    public String toString() {
        return String.format("Фермер: %s  |  HP: %d  |  Speed: %d  |  ATK: %d-%d  |  DEF: %d  |  (X,Y): (%d,%d) | Status: %s\n", this.name, this.hp, this.speed, this.damegeMin, this.damegeMax, this.def, this.pos.x, this.pos.y, this.state);
    }
}
