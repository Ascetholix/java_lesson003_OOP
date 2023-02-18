package Unit;

/**
 * Копейщик
 */
public class Spearman extends Person {
    int maxDamage;
    String name;

    public Spearman(int attack, int def, int damage, int maxHp, int speed, int maxDamage, String name) {
        super(attack, def, damage, maxHp, speed);
        this.maxDamage = maxDamage;
        this.name = name;
    }

    public Spearman(String name) {
        super(4, 5, 1, 10, 4);
        this.maxDamage = 3;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %2d-%d Hp: %3d Защита: %2d Скорость %2d Копейщик",
                this.name, this.attack, this.damage, this.maxDamage, this.maxHp, this.def,  this.speed);
    }



}
