package packages;

public class Question4 {

    // Abstract class Vehicle
    abstract static class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }

    // Hero class (two-wheeler)
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

    // Honda class (two-wheeler)
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

    // Logan class (four-wheeler)
    static class Logan extends Vehicle {
        private String modelName;
        private String registrationNumber;
        private String ownerName;
        private int speed;

        public Logan(String modelName, String registrationNumber, String ownerName, int speed) {
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

        public void gps() {
            System.out.println("GPS is active in Logan car...");
        }
    }

    // Ford class (four-wheeler)
    static class Ford extends Vehicle {
        private String modelName;
        private String registrationNumber;
        private String ownerName;
        private int speed;

        public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
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

        public void tempControl() {
            System.out.println("Temperature control is running in Ford car...");
        }
    }

    // Main method to test all classes
    public static void main(String[] args) {
        // Hero object
        Hero hero = new Hero("Hero Splendor", "KA01AB1234", "Ravi", 80);
        System.out.println("Hero Bike Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        // Honda object
        Honda honda = new Honda("Honda City", "KA05MK6789", "Anjali", 120);
        System.out.println("Honda Car Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();

        System.out.println();

        // Logan object
        Logan logan = new Logan("Logan Diesel", "MH12CD4567", "Ramesh", 100);
        System.out.println("Logan Car Details:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Registration: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.getSpeed());
        logan.gps();

        System.out.println();

        // Ford object
        Ford ford = new Ford("Ford EcoSport", "DL8CAF9876", "Sita", 110);
        System.out.println("Ford Car Details:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Registration: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.getSpeed());
        ford.tempControl();
    }
}

