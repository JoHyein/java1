package net.wikidocs.tele;

public class Item {
	private String name;
	private int length;
	private String value;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String raw() {
		return this.value;
	}
	
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("ÀÌ¸§");
		item.setLength(10);
		item.setValue("È«±æµ¿");
		System.out.println("["+item.raw()+"]");
	}
}


