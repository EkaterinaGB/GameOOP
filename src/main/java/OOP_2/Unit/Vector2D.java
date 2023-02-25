package OOP_2.Unit;

import java.util.ArrayList;
public class Vector2D {

    protected int x, y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Double distance(Vector2D oponent){
        return Math.sqrt(Math.pow(x - oponent.x,2) + Math.pow(y - oponent.y,2));
    }


}
