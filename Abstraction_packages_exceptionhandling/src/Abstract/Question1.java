package Abstract;

import java.util.Random;

//Abstract class
abstract class Compartment {
 public abstract String notice();
}

//FirstClass compartment
class FirstClass extends Compartment {
 public String notice() {
     return "First Class Compartment: Reserved for first class passengers.";
 }
}

//Ladies compartment
class Ladies extends Compartment {
 public String notice() {
     return "Ladies Compartment: Reserved for women passengers.";
 }
}

//General compartment
class General extends Compartment {
 public String notice() {
     return "General Compartment: Open for all passengers.";
 }
}

//Luggage compartment
class Luggage extends Compartment {
 public String notice() {
     return "Luggage Compartment: Reserved for luggage and goods.";
 }
}

//Test class
public class Question1 {
 public static void main(String[] args) {
     Compartment[] compartments = new Compartment[10];
     Random rand = new Random();

     for (int i = 0; i < compartments.length; i++) {
         int type = rand.nextInt(4) + 1; // Random number between 1 and 4

         switch (type) {
             case 1:
                 compartments[i] = new FirstClass();
                 break;
             case 2:
                 compartments[i] = new Ladies();
                 break;
             case 3:
                 compartments[i] = new General();
                 break;
             case 4:
                 compartments[i] = new Luggage();
                 break;
         }

         // Polymorphic behavior
         System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
     }
 }
}
