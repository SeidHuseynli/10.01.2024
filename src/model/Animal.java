package model;

import model.Test.Flyable;
import model.Test.Swimmable;

abstract class Animal implements Swimmable, Flyable {
	// Abstract methods
	abstract void makeSound();

	abstract String getSize();
}
