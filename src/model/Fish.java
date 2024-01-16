package model;

public class Fish extends Animal {

	private String size;

	public Fish(String size) {
		this.size = size;
	}

	@Override
	void makeSound() {
		System.out.println("Fish makes bubbling sound.");
	}

	@Override
	String getSize() {
		return size;
	}

	@Override
	public void swim() {
		System.out.println("Fish is swimming.");
	}

	@Override
	public void fly() {

		System.out.println("Fish can't fly.");
	}
}
