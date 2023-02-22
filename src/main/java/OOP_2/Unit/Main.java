package OOP_2.Unit;

import java.util.ArrayList;
import java.util.Comparator;



public class Main {
    public static void main(String[] args) {


        Monk monk = new Monk(Character.setName());
        System.out.println(monk.getInfo());

        ArrayList<Character> arrayList1 = new ArrayList<>();
        arrayList1.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Character.createArreyCharacter1(arrayList1, Character.setClass());
        }

        System.out.println("Команда 1:");

        for (int i = 0; i < arrayList1.size(); i++) {

            System.out.print(arrayList1.get(i).getInfo());
        }

        ArrayList<Character> arrayList2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Character.createArreyCharacter2(arrayList2, Character.setClass());
        }
        System.out.println();
        System.out.println("Команда 2:");


        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i).getInfo());
        }

        ArrayList arreyAll = new ArrayList<>(arrayList1);




        for (int i = 0; i < arrayList2.size(); i++) {
            arreyAll.add(arrayList2.get(i));
        }

        arreyAll.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                    return o1.getHp() - o2.getHp();
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        System.out.println();
        System.out.println(arreyAll);

    }
}
