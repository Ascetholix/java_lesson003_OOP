package Unit;

public abstract class Person implements GameInterface{
    //** Здоровье  */
    protected int hp;
    //** Атака  */
    protected int damage;
    protected int def;
    static int prCount;

    public Person(int hp, int damage, int def) {
        this.hp = hp;
        this.damage = damage;
        this.def = def;
        prCount++;
    }
    public static int getPrCount(){return prCount;}

    @Override
    public void step() { }

    @Override
    public String getInfo() {return "";}
}
