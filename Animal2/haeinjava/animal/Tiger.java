package haeinjava.animal;

public class Tiger extends Animal implements Predator, Barkable{
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("¾îÈï");
	}
}
