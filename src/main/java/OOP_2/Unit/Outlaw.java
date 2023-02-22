package OOP_2.Unit;

public class Outlaw extends Character{/*Разбойник*/
    protected int stealth; /*хтрость*/
    protected int steal;/*украсть*/

    public Outlaw(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, boolean hide) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.stealth = stealth;
        this.steal = steal;
    }
    public Outlaw(String name){
        super(name, 50, 1, 20, false, 30, 50, 2, 2, 10, 5, 5);
        this.stealth = 0;
        this.steal =0;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    public int getStealth(){
        return  0;
    }
    public int getSteal(){
        return  0;
    }
}
