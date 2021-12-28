import java.util.ArrayList;

public class SeatClass {
	private String className;
	private int price;
	private ArrayList<Generate_Row> row = new ArrayList<Generate_Row>();

	public SeatClass(String className, int price) {
		this.className = className;
		this.price = price;
		for (int i = 'A'; i <= 'A' + 10; i++)
			row.add(new Generate_Row(String.valueOf((char) i)));
	}

	public SeatClass() {
		for (int i = 'A'; i <= 'A' + 10; i++)
			row.add(new Generate_Row(String.valueOf((char) i)));
	}

	public String getClassName() {
		return className;
	}

	public int getPrice() {
		return price;
	}

	public ArrayList<Generate_Row> getRow() {
		return row;
	}
}
