
public class Circle implements Shape{
	
	private int ID;
	private int Radius;
	private String Color;
	private static final double pi = 3.14;
	
	public Circle(int id, int radius, String color) {
		ID = id;
		Radius = radius;
		Color = color;
	}

	public String toString() {
		//returns shape and shape ID
		return String.format("Circle (%d)", ID);
	}
	
	public String getKind() {
		// returns the kind of shape
		return "Circle";
	}

	public String getDetailString() {
		// returns the details of the shape
		// (kind, ID, properties, area, perimeter/circumference)
		double circumfrence = (2 * Radius) * pi;
		double area = (Radius * Radius) * pi;
		return String.format(" Circle (ID# %d)\n Color: %s\n Radius: %d\n Circumfrence: %f\n Area: %f\n", ID, Color, Radius, circumfrence, area);
	}

	public int getID() {
		// returns the ID of the shape
		return ID;
	}
	
}
