import java.util.ArrayList;


public class CharacterSystem {
    public Arraylist<Character> charactermap;

    public CharacterSystem {
        this.charactermap = new ArrayList<Character>();
    }
}



add method //STILL NEEDS CHECKING
public boolean add(String name, String element, int attack, String weapontype, Weapon weapon) {

    if (name == null) {
        return false;
    }
    if (attack == null) {
        return false;
    }
    // null weapon means character has no weapon equipped
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
    for (Character c: this.charactermap) {
        if (c.name == name) {
            return true;
        }
    }
    return false;
}

/*
remove method


find by element

find by weapon

order by attack (return ordered list)

find by certain attack
*/