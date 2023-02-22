package OOP_2.Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character implements GameInterface {
    protected String name;
    protected int hp;
    protected int levl;;
    protected int power;
    protected  boolean step;
    int speed;
    int maxHp, def, damegeMin, damegeMax, x,y;

    public Character(String name ){
        this.name = name;
        this.hp = 100;
        this.levl = 1;
        this.power = 100;
        this.step = false;
    }

    public Character(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.levl = levl;
        this.power = power;
        this.step = step;
        this.speed = speed;
        this.maxHp = maxHp;
        this.def = def;
        this.damegeMin = damegeMin;
        this.damegeMax = damegeMax;
        this.x = x;
        this.y = y;

    }
    public static String setName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassCharacter setClass(){
        return ClassCharacter.values()[new Random().nextInt(ClassCharacter.values().length -1)];
    }

    public static void createArreyCharacter1(ArrayList<Character> arrayList, ClassCharacter classCharacter){
        switch (classCharacter){
            case Sniper -> arrayList.add(new Sniper(setName()));
            case Mag -> arrayList.add(new Mag(setName()));
            case Monk -> arrayList.add(new Mag(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Outlaw -> arrayList.add(new Outlaw(setName()));
            case Spearman -> arrayList.add(new Sniper(setName()));
            case Crossbowman -> arrayList.add(new Outlaw(setName()));
        }
    }

    public static void createArreyCharacter2(ArrayList<Character> arrayList, ClassCharacter classCharacter){
        switch (classCharacter){
            case Monk -> arrayList.add(new Monk(setName()));
            case Mag -> arrayList.add(new Monk(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Spearman -> arrayList.add(new Spearman(setName()));
            case Outlaw -> arrayList.add(new Crossbowman(setName()));
            case Crossbowman -> arrayList.add(new Crossbowman(setName()));
            case Sniper -> arrayList.add(new Spearman(setName()));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, hp, speed);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }


    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }
}
