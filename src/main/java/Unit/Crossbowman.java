package Unit;
/**
 * Арбалетчик
 */
public class Crossbowman extends Shooter{
    public Crossbowman(int attack, int def, int damage, int maxHp, int speed, int shot, int maxDamade, String name) {
        super(attack, def, damage, maxHp, speed, shot, maxDamade, name);
    }

    public Crossbowman(String name) {
        super(6, 3, 2, 10, 4, 16,3, name);

    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %2d-%d Hp: %3d Защита: %2d Скорость %2d Выстрелы: %2d Арбачетчик",
                this.name, this.attack, this.damage, this.maxDamage, this.maxHp, this.def, this.speed, this.shot);
    }



}
