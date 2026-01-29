package Pack1;
 abstract class shape { 
	 
	 
 abstract void draw();
	
}
 
 class rectangle extends shape{
	void draw() {
		System.out.println("Is is rectangle");
	}
 }

public class abstractt {

	public static void main(String[] args) {
		rectangle rect = new rectangle();
		rect.draw();
		
		// TODO Auto-generated method stub

	}

}
