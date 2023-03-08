package OOP_2.Unit;

import OOP_2.Unit.Heroes.*;
import OOP_2.Unit.Heroes.Character;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int UNITS = 10;
    public static ArrayList<Character> holyTeam = new ArrayList<>();
    public static ArrayList<Character> darkTeam = new ArrayList<>();
    public static ArrayList<Character> allTeam = new ArrayList<>();
    static int dieHolyTeam = 0;
    static int dieDarkTeam = 0;

    public static void main(String[] args) {





        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortedTeam(allTeam);


        while (true){
            View.view();
            user_input.nextLine();
            for (Character human: allTeam) {
                if ( holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }
            for (Character human: holyTeam) {
                if (human.getState() == "Die") dieHolyTeam++;
            }
            if (dieHolyTeam == 10){
                System.out.println("******************************************Green winner!******************************************");
                break;
            } else dieHolyTeam = 0;
            for (Character human: darkTeam) {
                if (human.getState() == "Die") dieDarkTeam++;
            }
            if (dieDarkTeam == 10){
                System.out.println("******************************************Blue winner!******************************************");
                break;
            } else dieDarkTeam = 0;
        }


    }

    static void sortedTeam(ArrayList<Character> team){
        team.sort(new Comparator<Character>() { // Сортируем весь список
            @Override
            public int compare(Character o1, Character o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                    return o1.getHp() - o2.getHp();
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });
    }

    static void createTeam(ArrayList team, int offset, int posY){
        for (int i = 1; i <= UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd){
                case (0):
                    team.add(new Sniper(Character.getName(),i, posY));
                    break;
                case (1):
                    team.add(new Outlaw(Character.getName(),i, posY));
                    break;
                case (2):
                    team.add(new Mag(Character.getName(),i, posY));
                    break;
                case (3):
                    team.add(new Fermer(Character.getName(),i, posY));
                    break;
                case (4):
                    team.add(new Crossbowman(Character.getName(),i, posY));
                    break;
                case (5):
                    team.add(new Monk(Character.getName(),i, posY));
                    break;
                case (6):
                    team.add(new Spearman(Character.getName(),i, posY));
                    break;
            }
        }
    }


}
