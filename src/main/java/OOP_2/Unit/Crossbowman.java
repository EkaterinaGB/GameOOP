package OOP_2.Unit;

public class Crossbowman extends Arreys{/*Арбалетчик*/
    protected int accuracy; /*Точность*/

    protected int ammunition; /*Боеприпасы*/

    public Crossbowman(String name) {
        super(name, 100, 1, 100, false, 10, 100, 10, 5, 20, 1, 1, 10, 5);
        this.accuracy = 0;
        this.ammunition = 0;
    }

    public Crossbowman(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int cartriges, int distance, int accuracy, int ammunition ) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y, cartriges, distance);
        this.accuracy = accuracy;
        this.ammunition = ammunition;

    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }

    /**
     * Выстрел
     */
    public void shoot(){

    }


    public int getNdurance() {
        return 0;
    }
}
