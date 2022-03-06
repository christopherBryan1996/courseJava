package com.trewsct.java.poo;
//para compilar es
// javac -d . Dog.java
public class Dog {
	String name;
	int age;

	void fetch(Ball myBall){
		System.out.println(name+"is fetching a" + myBall.color+" ball...");
	}
}