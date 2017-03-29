import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Average average=new Average();
		
		List<Integer> integerList=new ArrayList();
		List<Double> doubleList=new ArrayList();
		List<Byte> byteList=new ArrayList();
		
		// Averaging Integer Type Number
		integerList.add(5);
		integerList.add(10);
		integerList.add(121);
		
		System.out.println("Average of Integers Are: " + average.giveAverage(integerList));
		
		// Averaging Double Type Number
		doubleList.add(10.0);
		doubleList.add(20.5);
		doubleList.add(50.3);
		
		System.out.println("Average of Doubles Are: " + average.giveAverage(doubleList));
		
		// Averaging Byte Type Number
		byteList.add((byte) 5);
		byteList.add((byte) 10);
		byteList.add((byte) 121);
		
		System.out.println("Average of Bytes Are: " + average.giveAverage(byteList));		
	}
}
