package OOP_2.Unit;

import java.util.ArrayList;

public class Spearman extends Warrior {/*Копейщик*/
    public Spearman(String name, int x, int y) {
        super(name, 4, 10, 5, 1, 3, x, y, 4);
    }

    @Override
    public void step(ArrayList<Character> t1, ArrayList<Character> t2) {

    }

    @Override
    public String getInfo() {
        return "Копейщик";
    }

}



