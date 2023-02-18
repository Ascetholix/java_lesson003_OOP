package Unit;

/**
 * Монах
 */
public class Monk extends Sorcerer {

    public Monk(int attack, int def, int damage, int maxHp, int speed, int magic, String name) {
        super(attack, def, damage, maxHp, speed, magic, name);
    }

    public Monk(String name) {
        super(12, 7, -4, 30, 5, 1, name);

    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %3d Hp: %3d Защита: %2d Скорость %2d Магия: %d2 Монах",
                this.name, this.attack, this.damage, this.maxHp, this.def, this.speed, this.magic);
    }


}
