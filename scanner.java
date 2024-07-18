import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// DO I SCRAP THISSSS????? MAYBE I KEEP
public class scanner {
    Arraylist<Character> character_database = new Arraylist<>();  // make character constructor later
    Arraylist<Weapon> weapon_database = new Arraylist<>();
    public static String scan(String filename, String filetype) {   //do i need to pass the arraylist as a method argument? MAYBE I DO NEED TO ADD THE CHARACTERSYSTEM AS A PARAMETER?????
        if (filetype == 'character') {
            try {
                File f = new File(filename);
                Scanner sc = new Scanner(f);
                while (sc.hasNextLine()) {
                    String[] scan = sc.nextLine().split(" ");  //[Ayaka, Cryo, 342, Sword, Dull blade]
                    //search arraylist for character duplicate (duplicate will be checked by name only)
                    if (character_database.contains(scan[0])) {
                        return -1;
                    }
                    if (scan[1] != 'Cryo' || scan[1] != 'Anemo' || scan[1] != 'Hydro' || scan[1] != 'Geo' || scan[1] != 'Pyro' || scan[1] != 'Dendro' || scan[1] != 'Electro') {
                        return -1;
                    }
                    if (scan[3] != 'Sword' || scan[3] != 'Polearm' || scan[3] != 'Bow' || scan[3] != 'Claymore' || scan[3] != 'Catalyst') {
                        return -1;
                    }
                    
                    //make new constructor and form it here, then add it to arraylist database
                    //Character c1 = new Character(scan[0], scan[1], scan[2], scan[3], scan[4]);
                    // call add method to add in the character that you just scanned 
                    // if add method does not add, then make note of which character failed, and continue to next one -> output failed character name
                    // if no fail throughout entire input file scan, just output "scan successful"
                        
                    
                }
                sc.close();
            }
            catch (FileNotFoundException e) {
                return -1;
            }
        }

        if (filetype == 'weapon') {
            try {
                File f = new File(filename);
                Scanner sc = new Scanner(f);
                while (sc.hasNextLine()) {
                    String[] scan = sc.nextLine().split(" ");  //[Mistplitter-Reforged Sword 674 CritDMG]
                    //search arraylist for character duplicate (duplicate will be checked by name only)
                    if (weapon_database.contains(scan[0])) {
                        return -1;
                    }
                    //checking substat
                    if (scan[3] != 'HP' || scan[3] != 'ATK' || scan[3] != 'DEF' || scan[3] != 'EM' || scan[3] != 'CritRate' || scan[3] != 'CritDMG' || scan[3] != 'ER' || scan[3] != 'PHYSDMG' || scan[3] != 'None') {
                        return -1;
                    }
                    //checking weapon type
                    if (scan[1] != 'Sword' || scan[1] != 'Polearm' || scan[1] != 'Bow' || scan[1] != 'Claymore' || scan[1] != 'Catalyst') {
                        return -1;
                    }
                    for (String s: scan) {
                        //make new constructor and form it here, then add it to arraylist database
                        
                    }
                }
                sc.close();
            }
            catch (FileNotFoundException e) {
                return -1;
            }
        }
    }   
        
    return 1;    //returns 1 for success, -1 for fail, add in fail cases later
}