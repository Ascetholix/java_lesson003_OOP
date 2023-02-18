package Unit;

/**
 * Колдун
 */
public class Mag extends Sorcerer {

    public Mag(int attack, int def, int damage, int maxHp, int speed, int magic, String name) {
        super(attack, def, damage, maxHp, speed, magic, name);
    }

    public Mag(String name) {
        super(17, 12, -5, 30, 9, 1, name);

    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %3d Hp: %3d Защита: %2d Скорость %2d Магия: %2d Колдун",
                this.name, this.attack, this.damage, this.maxHp, this.def, this.speed, this.magic);
    }


}
