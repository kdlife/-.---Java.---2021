package varChapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class VarWisList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var playerList = new ArrayList<String>();      // inferred as ArrayList<String>         
        var playerSet = new HashSet<String>();         // inferred as HashSet<String>
        var playerMap = new HashMap<String, String>(); // inferred as HashMap<String, String>     
        
        //
        // Before Java 7 in Project Coin
        // explicitly specifying generic class's instantiation parameter type
        List<String> players1 = new ArrayList<String>();

        // From Java 7 onwards using Project Coin
        // inferring generic class's instantiation parameter type 
        List<String> players2 = new ArrayList<>();

        // Avoid
        var playerList1 = new ArrayList<>(); // is inferred as ArrayList<Object>

        // Prefer
        var playerList2 = new ArrayList<String>(); // inferred as ArrayList<String>
        
	}

}
