package OOP_2.Unit.Heroes;

import java.util.ArrayList;


public class Crossbowman extends Arreys {/*Арбалетчик*/
    public Crossbowman(String name, int x, int y) {
        super(name, 4, 10, 3, 2, 3, x, y, 6, 16);
    }
    @Override
    public void step(ArrayList<Character> t1, ArrayList<Character> t2) {
        super.step(t1, t2);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}
