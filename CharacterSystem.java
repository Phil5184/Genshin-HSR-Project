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
        if (attack <= 0) {
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

    public boolean elementRemove(String element) {
        Arraylist<Character> c1 = this.charactermap;
        int initialcount = c1.size();
        for (int i = 0; i < c1.size(); i++) {   //goes through each index of the list, checks if the element of the character at that index matches, if it does then remove
            if (c1.get(i).element == element) {
                System.out.println("removed" + c1.get(i).name);   // < does not have to be gramatically correct
                c1.remove(i);
            }
        }
        if (c1.size() == initialcount) {
            System.out.println("No characters have been removed");
            return false;
        }
        return true;
    }

    public boolean weaponRemove(String weaponType) {
        Arraylist<Character> c2 = this.charactermap;
        int initialcount = c2.size();
        for (int i = 0; i < c2.size(); i++) {   //goes through each index of the list, checks if the weapontype of the character at that index matches, if it does then remove
            if (c2.get(i).weapontype == weaponType) {
                System.out.println("removed" + c2.get(i).name);   // < does not have to be gramatically correct
                c2.remove(i);
            }
        }
        if (c1.size() == initialcount) {
            System.out.println("No characters have been removed");
            return false;
        }
        return true;
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

    //Deal with multiple weapontypes same way as elements, type them out in this format: "Sword Polearm Bow"
    public Arraylist<Character> weaponFilter(String weaponType) {
        Arraylist<Character> toReturn = new Arraylist<>();
        String[] splitted = weaponType.split(" ");  //split the argument into the individual elements
        for (String s: splitted) {   //for each weapontype, search the list for characters of that element
            for (Character c: this.charactermap) { 
                if (c.weapontype == s) {
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