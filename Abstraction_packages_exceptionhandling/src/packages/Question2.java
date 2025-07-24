package packages;



public class Question2
{
    private double height;
    private double width;
    private double breadth;

    // Constructor
    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    // Method to calculate volume
    public double getVolume() {
        return height * width * breadth;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Compartment [Height = " + height + ", Width = " + width + ", Breadth = " + breadth +
               ", Volume = " + getVolume() + "]";
    }
}

