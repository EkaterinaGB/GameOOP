package OOP_2.Unit;

public class Mag extends Character {
    int mana;/*мана*/
    int spells; /*заклинания*/

    public Mag(String name) {
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30, 0, 0);
        this.mana = mana;
        this.spells = spells;

    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я маг!!!";
    }
    public void custSpell(){
        System.out.println("Использует заклинание");
    }

}
