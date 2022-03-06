package com.trewsct.java.poo;
//para compilar es
// javac -d . Persona.java
public class Persona {

	public void play(){
		Dog dog = new Dog();
		dog.name = "Firulais";
		dog.age= 5;

		Ball myRedMediumBall = new Ball();
		myRedMediumBall.color="red";
		myRedMediumBall.size="medium";

		dog.fetch(myRedMediumBall);
	}
}