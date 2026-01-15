package Pack1;

class animal{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("cat meows");
	}
}

public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a = new cat();
		a.sound();		

	}

}
