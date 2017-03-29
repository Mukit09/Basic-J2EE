import java.util.*;

public class ObjectSortingApp {
	
	public static <T> T[] sort(T[] list, Comparator<T> comparator){
		
		for(int i = 0; i < list.length; i++) {
			for (int j = i+1; j < list.length; j++) {
				if(comparator.compareTo(list[i],list[j]) > 0) {
					T temp = list[j];
	                		list[j] = list[i];
	                		list[i] = temp;
				}
			}
		}
		return list;
	}
	
	public static <T> void printArray(T[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> stringObject = new StringObject();
		Comparator<Integer> integerObject = new IntegerObject();
		Comparator<Student> studentObject = new StudentObject();
		
		Integer[] intArray={10,2,8,5};
		intArray=sort(intArray,integerObject);
		System.out.println("\nPrinting Sorted Integer Object");
		printArray(intArray);

		String[] stringArray={"Mukit","Chowdhury","Babu"};
		stringArray=sort(stringArray,stringObject);
		System.out.println("\nPrinting Sorted String Object");
		printArray(stringArray);
		
		Student[] studentArray={new Student(1,"Mukit"), new Student(2,"Chowdhury"), new Student(3,"Rana")};
		studentArray=sort(studentArray,studentObject);
		System.out.println("\nPrinting Sorted Student Object");
		printArray(studentArray);
	}

}
