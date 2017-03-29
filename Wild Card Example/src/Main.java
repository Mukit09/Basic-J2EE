import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Shape> list1=new ArrayList();
		List<Circle> list2=new ArrayList();
		List<Rectangle> list3=new ArrayList();
		
		Canvas canvas1=new Canvas();
		canvas1.name="Canvas 1";
		
		Canvas canvas2=new Canvas();
		canvas2.name="Canvas 2";
		
		Canvas canvas3=new Canvas();
		canvas3.name="Canvas 3";
		
		Rectangle rectangle=new Rectangle();
		Circle circle=new Circle();
		
		list1.add(circle);
		list1.add(rectangle);
		
		list2.add(circle);
		list2.add(circle);
		
		list3.add(rectangle);
		list3.add(rectangle);
		
		// For List of Any Shape Type Generic List
		canvas1.drawAll(list1);
		
		// For List of Only Circle Type Generic List
		canvas2.drawAll(list2);
		
		// For List of Only Rectangle Type Generic List
		canvas3.drawAll(list3);	
	}
}
