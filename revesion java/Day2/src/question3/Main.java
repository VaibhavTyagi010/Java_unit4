package question3;


class Animal {
	public Animal() {
			System.out.println("Animal Constructor");
	}
}

class Dog extends Animal {
	public Dog() {
			System.out.println("Dog Constructor");
	}
}

class Labrador extends Dog {
	public Labrador() {
			System.out.println("Labrador Constructor");
	}
}

public class Main {
	public static void main(String[] args) {
			Labrador labrador = new Labrador();
	}
}

