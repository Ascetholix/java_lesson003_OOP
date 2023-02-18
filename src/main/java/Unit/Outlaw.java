package Unit;

/**
 * Разбойник
 */
public class Outlaw extends Person {

    int stealth; // невидемость
    int theft; // кража
    String name;
    public Outlaw(int hp, int damage, int def,int stealth, int theft, String name) {
        super(hp, damage, def);
        this.stealth = stealth;
        this.theft = theft;
        this.name = name;
    }

    public Outlaw(String name) {
        super(100, 20, 5);
        this.stealth = 10;
        this.theft = 5;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Невидемость: %d Кража: %d Type: %s",
                this.name, this.hp, this.damage, this.def, this.stealth, this.theft, this.getClass().getSimpleName());
    }
}
