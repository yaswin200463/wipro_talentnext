package Classes_and_Objects;

public class Question1 {

	public static void main(String[] args) {
		Box v = new Box(2,2,2);
		System.out.println(v.getVolume());
		
	}

}
class Box{
	int width;
	int height;
	int depth;
	public Box(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double getVolume() {
		return width*height*depth;
	}
}
