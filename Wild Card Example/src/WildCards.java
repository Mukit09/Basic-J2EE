import java.util.List;

public class WildCards {
	
	public static void printCollection(List<?> list) {
		
		for(Object ob: list) {
			
			System.out.println(ob);
		}
	}

}
