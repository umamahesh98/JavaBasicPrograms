package Java8Concepts;

interface Movable {
	default void move() {
		System.out.println("Hello all this is default implementation");
	}

	void load();

	static public void drop() {
		System.out.println("You are in a  static block");
	}
}

public class DefaultMethodExample implements Movable {
	public void load() {
		System.out.println("Hi this is a overridded method");
	}

	public static void main(String[] args) {
		DefaultMethodExample obj = new DefaultMethodExample();

		obj.move();
		obj.load();
		Movable.drop();
	}

}
