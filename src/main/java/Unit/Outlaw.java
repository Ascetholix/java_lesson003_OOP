package Unit;

/**
 * Разбойник
 */
public class Outlaw extends Person {

    int maxDamage;
    String name;

    public Outlaw(int attack, int def, int damage, int maxHp, int speed, int maxDamage, String name) {
        super(attack, def, damage, maxHp, speed);
        this.maxDamage = maxDamage;
        this.name = name;
    }

    public Outlaw(String name) {
        super(8, 3, 2, 10, 6);
        this.maxDamage = 4;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %d-%d Hp: %3d Защита: %2d Скорость %2d Разбойник",
                this.name, this.attack, this.damage, this.maxDamage, this.maxHp, this.def,  this.speed);
    }

}
