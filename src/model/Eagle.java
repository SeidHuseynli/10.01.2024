package model;

public class Eagle extends Animal {

	private String size;

	public Eagle(String size) {
		this.size = size;
	}

	@Override
	void makeSound() {
		System.out.println("Eagle makes screeching sound.");
	}

	@Override
	String getSize() {
		return size;
	}

	@Override
	public void swim() {

		System.out.println("Eagle can't swim.");
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying high in the sky.");
	}
}
