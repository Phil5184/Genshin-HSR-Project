import tester.*; 

public class CharacterSystemTest {
    Weapon w1 = new Weapon("dull-blade", "Sword", 185, "None");
    Character c1 = new Character("Ayaka", "Cryo", 342, "Sword", w1);

    Weapon w2 = new Weapon("primordial-jade-winged-spear", "Polearm", 674, "CritRate");
    Character c2 = new Character("Xiao", "Anemo", 349, "Polearm", w2);

    Weapon w3 = new Weapon("engulfing-lightning", "Polearm", 608, "ER");
    Character c3 = new Character("Raiden-Shogun", "Electro", 337, "Polearm", w3);

    Weapon w4 = new Weapon("skyward-harp", "Bow", 674, "CritRate");
    Character c4 = new Character("Venti", "Anemo", 263, "Bow", w4);

    CharacterSystem file1 = new CharacterSystem();


    //Tests adding method
    void testAdd(Tester t) {
        t.checkExpect(file1.add("Ayaka", "Cryo", 342, "Sword", w1), true);
    }

    void testSearch(Tester t) {
        t.checkExpect(file1.search("Ayaka"), true);
    }

    void testRemove(Tester t) {
        t.checkExpect(file1.remove("Ayaka"), true);
    }

}
