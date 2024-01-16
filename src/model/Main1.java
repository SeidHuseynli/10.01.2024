package model;

public class Main1 {
	public static void main(String[] args) {

		Fish fish = new Fish("Small");
		Eagle eagle = new Eagle("Large");

		System.out.println("Fish Size: " + fish.getSize());
		fish.makeSound();
		fish.swim();
		fish.fly();

		System.out.println("\nEagle Size: " + eagle.getSize());
		eagle.makeSound();
		eagle.swim();
		eagle.fly();
	}
}
