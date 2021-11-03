import java.util.*;


public class HelloWorldApp{
	public static void main(String[] args){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("bakeball", "야구");
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
	}	
}