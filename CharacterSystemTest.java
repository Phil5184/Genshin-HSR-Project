import java.util.ArrayList;

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

    Weapon w5 = new Weapon("splendor-of-tranquil-waters", "Sword", 542, "CritDMG");
    Character c5 = new Character("Furina", "Hydro", 244, "Sword", w5);

    CharacterSystem file1 = new CharacterSystem();

    ArrayList<Character> file2 = new ArrayList<Character>(); //For elementFilter Testing

    ArrayList<Character> file3 = new ArrayList<Character>(); //For weaponFilter Testing


    //Tests adding method
    void testAdd(Tester t) {
        t.checkExpect(file1.add("Ayaka", "Cryo", 342, "Sword", w1), true);
        t.checkExpect(file1.add("Ayaka", "Electro", 342, "Sword", w1), false);
        t.checkExpect(file1.add("Ayaka", "Ice", 342, "Sword", w1), false);
        t.checkExpect(file1.add("Ayaka", "Cryro", 342, "Stick", w1), false);
        t.checkExpect(file1.add("Ayaka", "Cryro", 0, "Sword", w1), false);
        t.checkExpect(file1.add("Ayaka", "Cryro", -42609, "Sword", w1), false);
        t.checkExpect(file1.add(null, null, 0, null, null), false);
    }

    void testSearch(Tester t) {
        //If only Ayaka is added
        t.checkExpect(file1.search("Ayaka"), true);
        t.checkExpect(file1.search("Xiao"), false);
        t.checkExpect(file1.search(null), false);
        t.checkExpect(file1.search(""), false);
    }

    void testRemove(Tester t) {
        //If only Ayaka is added
        t.checkExpect(file1.remove("Ayaka"), true);
        t.checkExpect(file1.remove("Venti"), false);
        t.checkExpect(file1.remove(null), false);
        t.checkExpect(file1.remove(""), false);
    }

    void testElementRemove(Tester t) {
        //If Ayaka, Venti, Xiao added
        t.checkExpect(file1.elementRemove(null), false); //Needs to check if element input is valid (*NEEDS IMPLEMENTING)
        t.checkExpect(file1.elementRemove("Faker"), false); //Or some message that input is invalid (*NEEDS IMPLEMENTING or not right now...)
        t.checkExpect(file1.elementRemove("Geo"), false); //None Removed
        t.checkExpect(file1.elementRemove("Anemo"), true);
    }

    void testWeaponRemove(Tester t) {
        //If Ayaka, Furina, Raiden-Shogun added
        t.checkExpect(file1.weaponRemove(null), false); //Needs to check if weapontype input is valid (*NEEDS IMPLEMENTING)
        t.checkExpect(file1.weaponRemove("Stick"), false); //Or some message that input is invalid (*NEEDS IMPLEMENTING)
        t.checkExpect(file1.weaponRemove("Bow"), false); //None Removed
        t.checkExpect(file1.weaponRemove("Sword"), true);
    }

    void testElementFilter(Tester t) {
        //If Ayaka, Venti, Xiao added
        //t.checkExpect(file1.elementFilter("Anemo"), file2);
            //Erorr: The method elementFilter(String) from the type CharacterSystem refers to the missing type Arraylist Java(67108984)
        
    }

    void testWeaponFilter(Tester t) {
        //If Ayaka, Furina, Raiden-Shogun added
        
    }
}
