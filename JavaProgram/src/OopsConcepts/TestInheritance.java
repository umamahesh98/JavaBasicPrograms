package OopsConcepts;



class Inheritance {
	int a = 5;
	void parentTalking() {
		System.out.println("parent is talking");
	}
}

class Child extends Inheritance {
	void child() {
		System.out.println("The value of a is "+a);
	}
}

class TestInheritance{
	public static void main(String[] args) {
		Child d = new Child();
		d.parentTalking();
		d.child();
	}
}

