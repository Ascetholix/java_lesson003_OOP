package Unit;

/**
 * Фермер
 */
public class Farmer extends Person {
    String name;
    public Farmer(int hp, int damage, int def, String name) {
        super(hp, damage, def);
        this.name = name;
    }

    public Farmer(String name) {
        super(100, 0, 0);
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Type: %s",
                this.name, this.hp, this.damage, this.def, this.getClass().getSimpleName());
    }
}
