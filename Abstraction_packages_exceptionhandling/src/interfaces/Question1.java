package interfaces;

public class Question1 {

    // Simulating music package
    interface Playable {
        void play();
    }

    // Simulating music.string package
    static class Veena implements Playable {
        public void play() {
            System.out.println("Playing Veena...");
        }
    }

    // Simulating music.wind package
    static class Saxophone implements Playable {
        public void play() {
            System.out.println("Playing Saxophone...");
        }
    }

    // Simulating live package
    public static void main(String[] args) {
        // a. Create instance of Veena and call play()
        Veena veena = new Veena();
        veena.play();

        // b. Create instance of Saxophone and call play()
        Saxophone sax = new Saxophone();
        sax.play();

        // c. Using Playable interface reference
        Playable p1 = veena;
        Playable p2 = sax;

        p1.play();  // Should print: Playing Veena...
        p2.play();  // Should print: Playing Saxophone...
    }
}

