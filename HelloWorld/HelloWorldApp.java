import java.util.*;


public class HelloWorldApp{
	public static void main(String[] args){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "���");
		map.put("bakeball", "�߱�");
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
	}	
}