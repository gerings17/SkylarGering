import java.util.HashMap;
import java.util.Map.Entry;


public class CommonPairs {
	HashMap<String, String> map1 = new HashMap<String, String>();
	HashMap<String, String> map2 = new HashMap<String, String>();
	int numOfCommonPairs;
	
	public static void main(String[]args){
		CommonPairs a = new CommonPairs();
		a.addValues();
		a.commonKeyValuePairs(a.map1, a.map2);
		System.out.println("You have " + a.numOfCommonPairs + " common pairs.");
	}
	
	public int commonKeyValuePairs(HashMap<String, String>one, HashMap<String, String>two){
		map1 = one;
		map2 = two;
		for(Entry<String, String> pairs1: map1.entrySet()){
			for(Entry<String, String> pairs2: map2.entrySet()){
				if(pairs1.getKey().equals(pairs2.getKey())){
					if(pairs1.getValue().equals(pairs2.getValue())){
						numOfCommonPairs++;
					}
				}
			}
		}
		return numOfCommonPairs;
	}
	
	void addValues(){
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecstatic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		map2.put("Mary", "Ecstatic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Superb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
	}

}
