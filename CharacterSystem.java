import java.util.ArrayList;


public class CharacterSystem {
    public Arraylist<Character> charactermap; // *5 Error where Arraylist cannot resolve to a type; will go over on Monday [Hugh]

    public CharacterSystem() { 
        this.charactermap = new ArrayList<Character>(); // *5
    }



    //add method STILL NEEDS CHECKING
    public boolean add(String name, String element, int attack, String weapontype, Weapon weapon) {

        if (name == null) {
            return false;
        }
        if (attack == null) {
            return false;
        }
        // null weapon means character has no weapon equipped
        if (element != "Cryo" || element != "Anemo" || element != "Hydro" || element != "Geo" || element != "Pyro" || element != "Dendro" || element != "Electro") {
            return false;
        }
        if (weapontype != "Sword" || weapontype != "Polearm" || weapontype != "Bow" || weapontype != "Claymore" || weapontype != "Catalyst") {
            return false;
        }
        if (this.search(name)) {
            return false;
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
    public boolean remove(String name) {
        if (this.search(name)) { //if true, character is in the list so remove them
            int idx = 0;
            for (Character c: this.charactermap) {
                if (c.name == name) { //if the name equals, break out of the for loop and do the remove
                    break;
                }
                idx += 1;  //if name not found yet, just move on to the next index
            }
            this.charactermap.remove(idx);
            System.out.println("Your character has been removed");
            return true;
        }
        System.out.println("Your character is not in the list");
        return false;  //if false, then return false because character is not in the list

    }

    //How to deal with multiple elements (should be inputted in the form "element element element") like 'anemo cryo electro'
    public Arraylist<Character> elementFilter(String element) {
        Arraylist<Character> toReturn = new Arraylist<>();
        String[] splitted = element.split(" ");  //split the argument into the individual elements
        for (String s: splitted) {   //for each element, search the list for characters of that element
            for (Character c: this.charactermap) { 
                if (c.element == s) {
                    toReturn.add(c);
                }
            }
        }
        return toReturn;
    }
}


/*  
remove method
//later, should i add like remove by element or remove by weapon? < address this later

//add to this method to work with multiple elements
find by element

find by weapon

order by attack (return ordered list)

find by certain attack
*/