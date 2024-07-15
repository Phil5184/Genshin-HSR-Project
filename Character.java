public class Character {
    public String name;
    public String element;
    public int attack;
    public String weapontype;
    public Weapon weapon;
    
    public Character(String name, String element, int attack, String weapontype, Weapon weapon) {
        this.name = name;
        this.element = element;
        this.attack = attack;
        this.weapontype = weapontype;
        this.weapon = weapon;
    }
}