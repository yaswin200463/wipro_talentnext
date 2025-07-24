package Polymorphsm;

//Base class
class Fruit {
 String name;
 String taste;
 String size;


 public Fruit(String name, String taste, String size) {
     this.name = name;
     this.taste = taste;
     this.size = size;
 }

 
 public void eat() {
     System.out.println("The " + name + " tastes " + taste + ".");
 }
}


class Apple extends Fruit {
 public Apple() {
     super("Apple", "sweet", "medium");
 }

 @Override
 public void eat() {
     System.out.println("Apple is " + taste + " and crunchy.");
 }
}


class Orange extends Fruit {
 public Orange() {
     super("Orange", "citrusy", "small");
 }

 @Override
 public void eat() {
     System.out.println("Orange is " + taste + " and juicy.");
 }
}


public class Question1 {
 public static void main(String[] args) {
     Fruit fruit = new Fruit("Generic Fruit", "bland", "large");
     fruit.eat();

     Apple apple = new Apple();
     apple.eat();

     Orange orange = new Orange();
     orange.eat();
 }
}

