package Unit;

/**
 * Колдун
 */
public class Mag extends Sorcerer {

    int curse;
    public Mag(int hp, int damage, int def, int mana, String name, int curse) {
        super(hp, damage, def, mana, name);
        this.curse = curse;
    }

    public Mag(String name) {
        super(100, 1, 2, 50, name);
        this.curse = 10;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Проклятие: %d Мана: %d Type: %s",
                this.name, this.hp, this.damage, this.def, this.curse, this.mana, this.getClass().getSimpleName());
    }
}
