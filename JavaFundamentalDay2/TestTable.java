package JavaFundamentalDay2;

public class TestTable {
	public static void main(String[] args) {
		
		Table table = new Table();
		Table table2 = new Table();
		table.columns=3;
		table.rows=5;
		
		table2.columns=10;
		table2.rows=3;
		
		table.calc();
		table2.calc();
		Table.count();
	}

}
