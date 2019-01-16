
public class Rectangle implements Shape{
	
	private int ID;
	private int Length;
	private int Height;
	private String Color;
	
	public Rectangle(int id, int length, int height, String color) {
		ID = id;
		Length = length;
		Height = height;
		Color = color;
	}
	
	public String toString() {
		//returns shape and shape ID
		return String.format("Rectangle: (%d)", ID);
	}
	
	public String getKind() {
		// returns the kind of shape
		return "Rectangle";
	}

	public String getDetailString() {
		// returns the details of the shape
		// (kind, ID, properties, area, perimeter/circumference)
		int perimeter = (Length * 2) + (Height * 2);
		int area = Length * Height;
		return String.format(" Rectangle (ID# %d)\n Color: %s\n Side Length: %d\n Perimeter: %d\n Area: %d\n", ID, Color, Length, perimeter, area);
	}

	public int getID() {
		// returns the ID of the shape
		return ID;
	}
}
