import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class scanner {
    Arraylist<Character> character_database = new Arraylist<>();  // make character constructor later
    public int scan(String filename) {   //do i need to pass the arraylist as a method argument?   
        try {
	        File f = new File(filename);
	        Scanner sc = new Scanner(f);
	        while (sc.hasNextLine()) {
	            String[] scan = sc.nextLine().split(" ");  //[Ayaka, Cryo, 342, Sword, Dull blade]
                //search arraylist for character duplicate (duplicate will be checked by name only)
                if (scan[1] != Cryo || scan[1] != Anemo || scan[1] != Hydro || scan[1] != Geo || scan[1] != Pyro || scan[1] != Dendro || scan[1] != electro) {
                    return -1;
                }
                if (scan[3] != Sword || scan[2] != Polearm || scan[2] != Bow || scan[2] != Claymore || scan[2] != Catalyst) {
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
        return 1;    //returns 1 for success, -1 for fail, add in fail cases later
    }
}