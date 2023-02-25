package OOP_2.Unit;

public class Spearman extends Character {/*Копейщик*/
    int spear_possession;/*владение копьем*/

    public Spearman(String name) {
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30, 0, 0);
        this.spear_possession = 0;
    }

    public Spearman(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, boolean keepInLine) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.spear_possession = spear_possession;

    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }

    public int getSpearPossession() {
        return 0;
    }
}

