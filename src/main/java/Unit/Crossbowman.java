package Unit;
/**
 * Арбалетчик
 */
public class Crossbowman extends Shooter{
    private int shots;


    public Crossbowman(int hp, int damage, int def, float dist, int pin, String name,int shots) {
        super(hp, damage, def, dist, name);
        this.shots = shots;
    }

    public Crossbowman(String name) {
        super(100, 10, 5, 5, name);
        this.shots = 10;

    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d Стрелы: %d Дистанция: %f Type: %s",
                this.name, this.hp, this.damage, this.def, this.shots, this.dist, this.getClass().getSimpleName());
    }
}
