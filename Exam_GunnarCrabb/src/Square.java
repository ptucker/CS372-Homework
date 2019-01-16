
public class Square implements Shape{
	
	private int ID;
	private int Length;
	private String Color;
	
	public Square(int id, int length, String color) {
		ID = id;
		Length = length;
		Color = color;
	}
	
	public String toString() {
		//returns shape and shape ID
		return String.format("Square (%d)", ID);
	}
	
	public String getKind() {
		// returns the kind of shape
		return "Square";
	}

	public String getDetailString() {
		// returns the details of the shape
		// (kind, ID, properties, area, perimeter/circumference)
		int perimeter = Length * 4;
		int area = Length * Length;
		return String.format(" Square (ID# %d)\n Color: %s\n Side Length: %d\n Perimeter: %d\n Area: %d\n", ID, Color, Length, perimeter, area);
	}

	public int getID() {
		// returns the ID of the shape
		return ID;
	}
}
