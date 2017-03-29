import java.util.*;

public class Average {
	
	public <T extends Number> double giveAverage(List<T> list) {
		
		double sum=0.0;
		int length=list.size();
		
		for(Number number : list) {
			
			sum = sum + number.doubleValue();
		}
		return (sum/length);
	}
}
