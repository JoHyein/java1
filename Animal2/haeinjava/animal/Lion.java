package haeinjava.animal;

public class Lion extends Animal implements Predator, Barkable{
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("À¸¸£··");
	}
}
