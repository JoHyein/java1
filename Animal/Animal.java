class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	
	public void sleep() {
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog{
	
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for" + hour +" hours");
	}
	
	public HouseDog(int type) {
		if(type ==1) {
			this.setName("yorkshire");
		}else if (type == 2) {
            this.setName("bulldog");
        }

	}

}


interface Predator{
	public String getFood();
}

class Tiger extends Animal implements Predator, Barkable{
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("æÓ»Ô");
	}
}

class Lion extends Animal implements Predator, Barkable{
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("¿∏∏£∑∑");
	}
}

class ZooKeeper{
	
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
	}
	
}

interface Barkable{
	public void bark();
}

class Bouncer{
	public void barkAnimal(Barkable animal) {
		animal.bark();
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}

