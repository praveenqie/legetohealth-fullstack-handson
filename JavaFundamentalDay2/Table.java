package JavaFundamentalDay2;

public class Table {
	
	int rows;
	int columns;
	
	Table(){}
	static int counter;
	
	{
		System.out.println("increment counter ----");
		counter++;
	}
	
	public Table(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		System.out.println("Table row and column cunstructor");
	}



	public void calc() {
		int r = rows*columns;
		System.out.println("Result "+r);
	}
	
	public static void count() {
		System.out.println("Number of tables "+counter);
	}

}
