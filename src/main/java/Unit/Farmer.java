package Unit;

/**
 * Фермер
 */
public class Farmer extends Person {
    int  delivery;
    String name;

    public Farmer(int attack, int def, int damage, int maxHp, int speed, int delivery, String name) {
        super(attack, def, damage, maxHp, speed);
        this.delivery = delivery;
        this.name = name;
    }


    public Farmer(String name) {
        super(1, 1, 1, 1, 3);
        this.delivery = 1;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %3d Hp: %3d Защита: %2d Скорость %2d Фермер",
                this.name, this.attack, this.damage, this.maxHp, this.def, this.speed);
    }


}
