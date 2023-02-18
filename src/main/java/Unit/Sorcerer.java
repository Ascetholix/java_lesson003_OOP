package Unit;
/**
 * Абстрактный класс Черодей
 */
public abstract class Sorcerer extends Person{
     int mana;
     String name;
    public Sorcerer(int hp, int damage, int def,int mana, String name) {
        super(hp, damage, def);
        this.mana = mana;
        this.name = name;
    }
}
