import java.util.ArrayList;

// *1 fixed error with brackets; the class character systems needs to contain all the methods [Hugh]
public class CharacterSystem {
    public Arraylist<Character> charactermap; // *5 Error where Arraylist cannot resolve to a type; will go over on Monday [Hugh]

    public CharacterSystem() { // *2 Fixed constructor syntax error "()" [Hugh]
        this.charactermap = new ArrayList<Character>(); // *5
    }



    // *3 commented the "add method" portion [Hugh]
    //add method STILL NEEDS CHECKING
    public boolean add(String name, String element, int attack, String weapontype, Weapon weapon) {

        if (name == null) {
            return false;
        }
        if (attack == null) {
            return false;
        }
        // null weapon means character has no weapon equipped
        // *4 Invalid character constant for all checks of the elemnt and weapon types; will go over on Monday [Hugh]
        if (element != 'Cryo' || element != 'Anemo' || element != 'Hydro' || element != 'Geo' || element != 'Pyro' || element != 'Dendro' || element != 'Electro') {
            return false;
        }
        if (weapontype != 'Sword' || weapontype != 'Polearm' || weapontype != 'Bow' || weapontype != 'Claymore' || weapontype != 'Catalyst') {
            return false;
        }
        if (this.charactermap.search(name)) {
            return false
        }
        Character toAdd = new Character(name, element, attack, weapontype, weapon);
        this.charactermap.add(toAdd);
        return true;
        
    }
    //search (contains) by name only (filter by name only) . True means it is in the list, false means it is not in the list
    public boolean search(String name) {
        for (Character c: this.charactermap) { // *5
            if (c.name == name) {
                return true;
            }
        }
        return false;
    }
} // *1 


/*
remove method


find by element

find by weapon

order by attack (return ordered list)

find by certain attack
*/