package Unit;

/**
 * Абстрактный класс Стрелок
 */
public abstract class Shooter extends Person{

    int shot;
    int maxDamage;
    public String name;


    public Shooter(int attack, int def, int damage, int maxHp, int speed, int shot, int maxDamage, String name) {
        super(attack, def, damage, maxHp, speed);
        this.shot = shot;
        this.maxDamage = maxDamage;
        this.name = name;
    }

}
