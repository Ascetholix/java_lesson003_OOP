package Unit;

/**
 * Монах
 */
public class Monk extends Sorcerer {

    int treatment;

    public Monk(int hp, int damage, int def, int mana, String name, int treatment) {
        super(hp, damage, def, mana, name);
        this.treatment = treatment;
    }

    public Monk(String name) {
        super(100, 1, 2, 50, name);
        this.treatment = 10;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Лечение: %d Мана: %d Type: %s",
                this.name, this.hp, this.damage, this.def, this.treatment, this.mana, this.getClass().getSimpleName());
    }
}
