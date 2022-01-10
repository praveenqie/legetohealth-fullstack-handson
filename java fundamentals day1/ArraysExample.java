package javafundamental;

public class ArraysExample {

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]);
		
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("===============================");
		for(String car:cars) {
			System.out.println(car);
		}

	}

}
