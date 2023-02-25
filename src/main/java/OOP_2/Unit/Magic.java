package OOP_2.Unit;

import java.util.ArrayList;
import java.util.List;

public abstract class Magic extends Character{
    protected boolean magic;

    public Magic(String name, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int attack, boolean magic) {
        super(name, speed, maxHp, def, damegeMin, damegeMax, x, y, attack);
        this.magic = magic;
    }



    @Override
    public void step(ArrayList<Character> t1, ArrayList<Character> t2) {
        if (state.equals("Die")) return;
        for (int i = 0; i < t1.size(); i++) {
            if (t1.get(i).hp < t1.get(i).maxHp){
                t1.get(i).getDamage(damegeMax);
                break;
            }
        }

    }

    public abstract String getInfo();
}