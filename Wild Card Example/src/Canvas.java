import java.util.*;

public class Canvas {
	
	String name;
	public void drawAll(List<? extends Shape> list){
		
		for(Shape shape: list) {
			shape.draw(this);
		}
		System.out.println("");
	}
}
