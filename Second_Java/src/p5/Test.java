package p5;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a Sound");
	}
}

// Dog class extends Animal class
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}

//Cta class extends Animal class
class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The cat meows");
	}
}

//main class
public class Test {

	// main method
	public static void main(String[] args) {

		Animal al = new Animal();
		al.makeSound();

		Dog dg = new Dog();
		dg.makeSound();

		Cat ct = new Cat();
		ct.makeSound();

	}

}
