package OOP_2.Unit;

public class Monk extends Magic {
    public Monk(String name, int x, int y) {
        super(name, 5, 30, 7, -4, -4, x, y, 12, true);
    }
    @Override
    public String getInfo() {
        return "Монах";
    }

}



