package overriding;


class Fruit {
 String name;
 String taste;
 String size;


 Fruit(String name, String taste, String size) {
     this.name = name;
     this.taste = taste;
     this.size = size;
 }


 void eat() {
     System.out.println("The fruit is " + name + " and it tastes " + taste + ".");
 }
}

class Apple extends Fruit {
 Apple() {
     super("Apple", "Sweet", "Medium");
 }


 @Override
 void eat() {
     System.out.println("The fruit is " + name + ". It tastes " + taste + " and is usually " + size + " in size.");
 }
}


class Orange extends Fruit {
 Orange() {
     super("Orange", "Citrusy", "Medium");
 }

 @Override
 void eat() {
     System.out.println("The fruit is " + name + ". It tastes " + taste + " and is usually " + size + " in size.");
 }
}
public class Question1 {
 public static void main(String[] args) {
     Fruit genericFruit = new Fruit("Generic Fruit", "Unknown", "Varies");
     genericFruit.eat();

     Apple apple = new Apple();
     apple.eat();

     Orange orange = new Orange();
     orange.eat();
 }
}

