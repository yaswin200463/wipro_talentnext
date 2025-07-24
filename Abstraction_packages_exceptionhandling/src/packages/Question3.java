package packages;

public class Question3 {

    // Abstract class Vehicle
    abstract static class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }

    // Hero class under com.automobile.twowheeler
    static class Hero extends Vehicle {
        private String modelName;
        private String registrationNumber;
        private String ownerName;
        private int speed;

        public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() {
            return modelName;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public int getSpeed() {
            return speed;
        }

        public void radio() {
            System.out.println("Radio is playing in Hero bike...");
        }
    }

    // Honda class under com.automobile.twowheeler
    static class Honda extends Vehicle {
        private String modelName;
        private String registrationNumber;
        private String ownerName;
        private int speed;

        public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() {
            return modelName;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public int getSpeed() {
            return speed;
        }

        public void cdplayer() {
            System.out.println("CD player is running in Honda car...");
        }
    }

    // Main method to test both classes
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "KA01AB1234", "Ravi", 80);
        System.out.println("Hero Bike Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda("Honda City", "KA05MK6789", "Anjali", 120);
        System.out.println("Honda Car Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}

