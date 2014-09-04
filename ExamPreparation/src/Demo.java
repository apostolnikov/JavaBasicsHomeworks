import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);  //ako gurmi zaradi to4ka ili zapetaq 

		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("Misho", new ArrayList<Integer>(Arrays.asList(5,6)));
		map.put("Tosho", new ArrayList<Integer>(Arrays.asList(5,6)));
		map.put("Gosho", new ArrayList<Integer>(Arrays.asList(5,6)));
		map.put("Stavri", new ArrayList<Integer>(Arrays.asList(5,6)));
		map.put("Stamen", new ArrayList<Integer>(Arrays.asList(5,6)));
		
		for (String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
		
		BigDecimal gosho = new BigDecimal("" + 0);
		
		
		
	}

}
