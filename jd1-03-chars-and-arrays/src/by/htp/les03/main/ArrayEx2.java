package by.htp.les03.main;

public class ArrayEx2 {

	public static void main(String[] args) {
		Item[] mas = new Item[3];
		
		mas[0] = new Item(1);
		mas[1] = new Item(2);
		mas[2] = new Item(3);
		
		Item[] mas2 = mas.clone();
		
		print(mas);
		print(mas2);
		
		mas2[0].x = 123;
		
		System.out.println("----------------------");
		print(mas);
		print(mas2);
		
	}
	
	
	public static void print(Item[] mas) {
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i].x + " ");
		}
		System.out.println();
	}

}

class Item{
	Item(int _x){
		x = _x;
	}
	
	int x;
}
