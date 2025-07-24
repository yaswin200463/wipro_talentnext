package Inheritence;


class Animal {
 public void eat() {
     System.out.println("Animal is eating...");
 }

 public void sleep() {
     System.out.println("Animal is sleeping...");
 }
}


class Bird extends Animal {
 @Override
 public void eat() {
     System.out.println("Bird is pecking food...");
 }

 @Override
 public void sleep() {
     System.out.println("Bird is sleeping in its nest...");
 }


 public void fly() {
     System.out.println("Bird is flying in the sky...");
 }
}


public class Question1 {
 public static void main(String[] args) {
   
     Animal animal = new Animal();
     System.out.println("=== Animal Actions ===");
     animal.eat();
     animal.sleep();


     Bird bird = new Bird();
     System.out.println("\n=== Bird Actions ===");
     bird.eat();   
     bird.sleep();
     bird.fly();  // new method
 }
}

