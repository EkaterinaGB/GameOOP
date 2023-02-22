package OOP_2.Unit;

public class Monk extends Character {
    int potions;/*зелья*/
    int invisibility;/*невидимость*/

    public Monk(String name) {
        super(name, 100, 1, 100, false, 20, 100, 10, 10, 20, 1, 5);
        this.potions = 10;
        this.invisibility = 10;
    }

    public Monk(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int motivation, int combatSkill) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.potions = potions;
        this.invisibility = invisibility;

    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я монах!!! ";
    }

    public int getPotions() {
        return 0;

    }

    public int getInvisibility() {
        return 0;

    }

}
