package Unit;

/**
 * Снайпер
 */
public class Sniper extends Shooter{
    int speedAttack;  // Скорость атаки

    public Sniper(int hp, int damage, int def, float dist, String name, int speedAttack) {
        super(hp, damage, def, dist, name);
        this.speedAttack = speedAttack;
    }

    public Sniper(String name) {
        super(100, 5, 5, 10, name);
        this.speedAttack = 2;
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Скорострельность: %d Дистанция: %f Type: %s",
                this.name, this.hp, this.damage, this.def, this.speedAttack, this.dist, this.getClass().getSimpleName());
    }
}


