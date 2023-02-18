import Unit.*;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        int character = 10; // количичество персонажей

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.addAll(getUnit(character,1));

        arrayList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        System.out.println("Команда 1");
        for (int i = 0; i <character; i++) {
            System.out.println(arrayList.get(i).getInfo());
        }

        ArrayList<Person> arrayList1 = new ArrayList<>();
        arrayList1.addAll(getUnit(character,2));

        arrayList1.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        System.out.println("Команда 2");
        for (int i = 0; i <character; i++) {
            System.out.println(arrayList1.get(i).getInfo());
        }

        System.out.println("Количество персонажей" + " " + Person.getPrCount());

    }
    //** Метод именование персонажей */
    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }
    //** Методы создание персонажей */
    private static ArrayList getUnit(int a, int group) {
        Random rnd = new Random();
        ArrayList<Person> arrayList = new ArrayList<>();
        if (group == 0){
            for (int i = 0; i < a; i++) {
                int per = rnd.nextInt(6);
                switch (per) {
                    case 0:
                        Crossbowman crossbowman = new Crossbowman(getName());
                        arrayList.add(crossbowman);
                        break;
                    case 1:
                        Sniper sniper = new Sniper(getName());
                        arrayList.add(sniper);
                        break;
                    case 2:
                        Monk monk = new Monk(getName());
                        arrayList.add(monk);
                        break;
                    case 3:
                        Mag mag = new Mag(getName());
                        arrayList.add(mag);
                        break;
                    case 4:
                        Spearman spearman = new Spearman(getName());
                        arrayList.add(spearman);
                        break;
                    case 5:
                        Outlaw outlaw = new Outlaw(getName());
                        arrayList.add(outlaw);
                        break;
                    case 6:
                        Farmer farmer = new Farmer(getName());
                        arrayList.add(farmer);
                        break;
                }
            }

        }
        if(group == 1){
            for (int i = 0; i < a; i++) {
                int per = rnd.nextInt(3);
                switch (per) {
                    case 0:
                        Farmer farmer = new Farmer(getName());
                        arrayList.add(farmer);
                        break;
                    case 1:
                        Mag mag = new Mag(getName());
                        arrayList.add(mag);
                        break;
                    case 2:
                        Outlaw outlaw = new Outlaw(getName());
                        arrayList.add(outlaw);
                        break;
                    case 3:
                        Sniper sniper = new Sniper(getName());
                        arrayList.add(sniper);
                        break;
                }
            }

        }
        if(group == 2){
            for (int i = 0; i < a; i++) {
                int per = rnd.nextInt(3);
                switch (per) {
                    case 0:
                        Crossbowman crossbowman = new Crossbowman(getName());
                        arrayList.add(crossbowman);
                        break;
                    case 1:
                        Sniper sniper = new Sniper(getName());
                        arrayList.add(sniper);
                        break;
                    case 2:
                        Spearman spearman = new Spearman(getName());
                        arrayList.add(spearman);
                        break;
                    case 3:
                        Farmer farmer = new Farmer(getName());
                        arrayList.add(farmer);
                        break;
                }
            }
        }

        return arrayList;
    }
}