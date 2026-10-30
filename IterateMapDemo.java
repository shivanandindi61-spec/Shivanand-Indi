package Project;
import java.util.HashMap;
import java.util.Map;

public class IterateMapDemo {
	public static void main(String[]args) {
		HashMap<String,Integer>scores=new HashMap<>();
		scores.put("Asha",90);
		scores.put("Rahul",78);
		for(Map.Entry<String,Integer>entry:scores.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
