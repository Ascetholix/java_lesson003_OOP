package Unit;

/**
 * Снайпер
 */
public class Sniper extends Shooter{


    public Sniper(int attack, int def, int damage, int maxHp, int speed, int shot, int maxDamage, String name) {
        super(attack, def, damage, maxHp, speed, shot, maxDamage, name);
    }

    public Sniper(String name){
        super(12, 10, 8, 15, 9, 32, 10, name);
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %9s Атака: %2d Урон: %d-%d Hp: %3d Защита: %2d Скорость %2d Выстрелы: %2d Снайпер",
                this.name, this.attack, this.damage, this.maxDamage, this.maxHp, this.def, this.speed, this.shot);
    }



}


