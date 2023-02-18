package Unit;
/**
 * Абстрактный класс Черодей
 */
public abstract class Sorcerer extends Person{
     int magic;
     String name;

    public Sorcerer(int attack, int def, int damage, int maxHp, int speed, int magic, String name) {
        super(attack, def, damage, maxHp, speed);
        this.magic = magic;
        this.name = name;
    }

}
