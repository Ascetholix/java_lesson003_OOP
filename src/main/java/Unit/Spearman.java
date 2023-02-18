package Unit;

/**
 * Копейщик
 */
public class Spearman extends Person {
    int spearLength; // длина копья
    int impactForce; // сила удара
    String name;
    public Spearman(int hp, int damage, int def,int spearLength, int impactForce, String name) {
        super(hp, damage, def);
        this.spearLength = spearLength;
        this.impactForce = impactForce;
        this.name = name;
    }

    public Spearman(String name) {
        super(100, 10, 10);
        this.name = name;
        this.impactForce = 5;
        this.spearLength = 4;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Длина копья: %d Сила удара: %d Type: %s",
                this.name, this.hp, this.damage, this.def, this.spearLength, this.impactForce, this.getClass().getSimpleName());
    }
}
