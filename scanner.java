import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class scanner {
    Arraylist<character> character_database = new Arraylist<>();  // make character constructor later
    public int scan(String filename) {   //do i need to pass the arraylist as a method argument?   
        try {
	        File f = new File(filename);
	        Scanner sc = new Scanner(f);
	        while (sc.hasNextLine()) {
	            String[] scan = sc.nextLine().split(" ");
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