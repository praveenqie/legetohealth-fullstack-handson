package JavaFundamentalDay2;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		add(50);
		System.out.println("-----------------------");
		add(20f,43f);
		System.out.println("-----------------------");
		add(20,30f);
		System.out.println("-----------------------");
		add(20,30l);
	}

	public static void add(int a) {
		System.out.println("int a");
	}

	public static void add(int a, int b) {
		System.out.println("int a,int b");
	}

	public static void add(byte a, byte b) {
		System.out.println("byte a,byte b");
	}

	public static void add(long a, long b) {
		System.out.println("long a,long b");
	}

	public static void add(long a, int b) {
		System.out.println("long a,int b");
	}

	public static void add(float a, float b) {
		System.out.println("float a,float b");
	}

	public static void add(double a, double b) {
		System.out.println("double a,double b");
	}
}
