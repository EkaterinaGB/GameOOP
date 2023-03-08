package OOP_2.Unit.Heroes;

import java.util.ArrayList;
public interface GameInterface {

    default void step(ArrayList<Character> t1, ArrayList<Character> t2) {
    }


    String getInfo();
}
