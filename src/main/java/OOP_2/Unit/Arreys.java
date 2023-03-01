package OOP_2.Unit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arreys extends Character {
    int shoot; // выстрелы

    public Arreys(String name, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int attack, int shoot) {
        super(name, speed, maxHp, def, damegeMin, damegeMax, x, y, attack);
        this.shoot = shoot;
    }
    @Override
    public void step(ArrayList<Character> t1, ArrayList<Character> t2) {
        if (state.equals("DIe") || shoot == 0) return;
        int target = findNearest(t2);
        float damdge = (t2.get(target).def - attack > 0) ?
                damegeMin : (t2.get(target).def - attack < 0) ?
                damegeMax : ( (damegeMax+damegeMin) / 2);
        t2.get(target).getDamage(damdge);

        for (int i = 0; i < t1.size(); i++) {
            if (( t1.get(i).getInfo().equals("Фермер")) && t1.get(i).state.equals("Stand")){
                t1.get(i).state = "Busy";
                return;
            }
        }
        shoot --;
    }


}

