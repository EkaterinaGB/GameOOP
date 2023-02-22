package OOP_2.Unit;

public class Fermer extends Character {/*Крестьянин*/

    protected int feed;/*восполнять запасы*/
    protected int cartriges; /*Боеприпасы*/

    public Fermer(String name){
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30, 0, 0);
        this.feed = 20;
        this.cartriges = 50;
    }


    public Fermer(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int food, int cartriges) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.feed = feed;
        this.cartriges = cartriges;

    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я фермер!!";
    }


    public int getCartriges() {
        return 10;
    }

    public int getFeed() {
        return 10;

    }


}
