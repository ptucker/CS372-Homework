import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Fileio {
		
		private ArrayList<Shape> shapes;
		
		public Fileio() {
			
			int x = 100;
			shapes = new ArrayList<Shape>(x);
			
			JSONParser parser = new JSONParser();
			
			try {
				Object obj = parser.parse(new FileReader("C:\\Users\\rannu\\Desktop\\shapes.json"));
				
				JSONObject shapeObj = (JSONObject) obj;
				JSONArray shapeArray = (JSONArray) shapeObj.get("shapes");
				
				for (Object s : shapeArray) {
					
					JSONObject shape = (JSONObject) s;
				
					String type = (String) shape.get("type");
					Long ido = (Long) shape.get("id");
					Integer id = new Integer(ido.intValue());
					String color = (String) shape.get("color");
					if (type.equals("circle")) {
						Long rad = (Long) shape.get("radius");
						Integer radius = new Integer(rad.intValue());
						shapes.add(new Circle(id, radius, color));
					}
					if (type.equals("square")) {
						Long len = (Long) shape.get("side");
						Integer length = new Integer(len.intValue());
						shapes.add(new Square(id, length, color));
					}
					if (type.equals("rectangle")) {
						Long len = (Long) shape.get("length");
						Long wid = (Long) shape.get("width");
						Integer length = new Integer(len.intValue());
						Integer width = new Integer(wid.intValue());
						shapes.add(new Rectangle(id, length, width, color));
					}
					if (type.equals("triangle")) {
						Long s1o = (Long) shape.get("side1");
						Long s2o = (Long) shape.get("side2");
						Long s3o = (Long) shape.get("side3");
						Integer s1 = new Integer(s1o.intValue());
						Integer s2 = new Integer(s2o.intValue());
						Integer s3 = new Integer(s3o.intValue());
						shapes.add(new Triangle(id, s1, s2, s3, color));
					}
				}
				
				
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		public ArrayList<Shape> getList() {
			return shapes;
		}
	}
