package testassng;


class Animal
{
 private String name;
 private int age;
 
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }
 
 public void eat() {
     System.out.println(name + " is eating.");
 }
 
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
 
 public void makeSound() {
     System.out.println("Animal sound.");
 }
}

//subclass
class Cat extends Animal {
 public Cat(String name, int age) 
 {
     super(name, age);
 }
 
 @Override
 public void makeSound() {
     System.out.println("Meow.");
 }
}

//subclass
class Dog extends Animal {
 public Dog(String name, int age) 
 {
     super(name, age);
 }
 
 @Override
 public void makeSound() {
     System.out.println("Woof.");
 }
}

public class Inherani {
 public static void main(String[] args) {
     // create animal objects
     Animal myAnimal = new Animal("Generic animal", 5);
     Cat myCat = new Cat("Fluffy", 3);
     Dog myDog = new Dog("Rex", 7);
     
     // call methods from the superclass and subclasses
     myAnimal.eat();
     myAnimal.sleep();
     myAnimal.makeSound();
     
     myCat.eat();
     myCat.sleep();
     myCat.makeSound();
     
     myDog.eat();
     myDog.sleep();
     myDog.makeSound();
 }
}

