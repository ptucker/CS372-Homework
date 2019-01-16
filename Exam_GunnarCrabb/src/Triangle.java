import java.lang.Math;
public class Triangle implements Shape{
	
	private int ID;
	private int S1;
	private int S2;
	private int S3;
	private String Color;
	
	public Triangle(int id, int s1, int s2, int s3, String color) {
		ID = id;
		S1 = s1;
		S2 = s2;
		S3 = s3;
		Color = color;
	}

	public String toString() {
		//returns shape and shape ID
		return String.format("Triangle (%d)", ID);
	}
	
	public String getKind() {
		// returns the kind of shape
		return "Triangle";
	}

	public String getDetailString() {
		// returns the details of the shape
		// (kind, ID, properties, area, perimeter/circumference)
		int perimeter = S1 + S2 + S3;
		double p = perimeter/2;
		double a = p*(p-S1)*(p-S2)*(p-S3);
		double area = Math.sqrt(a);
		return String.format(" Triangle (ID# %d)\n Color: %s\n Side 1: %d\n Side 2: %d\\n Side 3: %d\\n Perimeter: %d\n Area: %f\n", ID, Color, S1, S2, S3, perimeter, area);
	}

	public int getID() {
		// returns the ID of the shape
		return 0;
	}
}
