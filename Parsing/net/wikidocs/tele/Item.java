package net.wikidocs.tele;


//요청 : 이름(10)+전화번호(11)
//응답 : 생일(8)+주소(30)

public class Item {
	private String name; //이름
	private int length; //길이
	private String value; //값
	
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
		StringBuffer padded = new StringBuffer(this.value);
		while(padded.toString().getBytes().length<this.length) {
			padded.append(' ');
		}
		return padded.toString();
	}
	
	
	//Item 객체 생성 매소드 static 추가 --> 팩토리 매소드
	public static Item create(String name, int length, String value) {
		Item item = new Item();
		item.setName(name);
		item.setLength(length);
		item.setValue(value);
		return item;
	}
	
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("이름");
		item.setLength(10);
		item.setValue("홍길동");
		System.out.println("["+item.raw()+"]");
	}
}


