import java.util.HashMap;
import java.util.Map.Entry;


public class DatingPool {
	HashMap<String, String> eligibleBachelors = new HashMap<String, String>();
	String message = "Mary can date these people: ";
	
	public static void main(String[]args){
		DatingPool a = new DatingPool();
		a.addDates();
		a.howManyDates();
	}
	
	public void howManyDates(){
		for(Entry<String, String> dates: eligibleBachelors.entrySet()){
			if(dates.getValue().equals("liberal")){
				message += (dates.getKey()) + " ";
			}
		}
		System.out.println(message);
	}
	
	public void addDates(){
		eligibleBachelors.put("Max", "Conservative");  
		eligibleBachelors.put("Bob", "conservative"); 
		eligibleBachelors.put("Diego ", "libertarian");
		eligibleBachelors.put("Felix", "Independant");
		eligibleBachelors.put("William", " Republican");  
		eligibleBachelors.put("Chuck", " Republican");  
		eligibleBachelors.put("Matthew ", "liberal");  
		eligibleBachelors.put("Jose ", "Democrat");  
		eligibleBachelors.put("Elizabeth ", "liberal"); 
	}
}
