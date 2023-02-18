import Unit.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int per = rnd.nextInt(6);
            switch (per){
                case 0:
                    Crossbowman crossbowman = new Crossbowman(getName());
                    arrayList.add(crossbowman);
                    break;
                case 1:
                    Sniper sniper = new Sniper(getName());;
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
        for (int i = 0; i <10; i++) {
            System.out.println(arrayList.get(i).getInfo());
        }
        System.out.println("Количество персонажей"+" "+Person.getPrCount());

    }
    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
