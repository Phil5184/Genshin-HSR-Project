import tester.*; 

public class CharacterSystemTest {
    Weapon w1 = new Weapon("dull-blade", "Sword", 185, "None");
    Character c1 = new Character("Ayaka", "Cryo", 342, "Sword", w1);

    Weapon w2 = new Weapon("primordial-jade-winged-spear", "Polearm", 674, "CritRate");
    Character c2 = new Character("Xiao", "Anemo", 349, "Polearm", w2);

}
