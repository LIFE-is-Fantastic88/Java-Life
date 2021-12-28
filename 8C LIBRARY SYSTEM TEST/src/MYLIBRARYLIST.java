import java.util.ArrayList;

public class MYLIBRARYLIST {
	private ArrayList<book> arraylist;

	public MYLIBRARYLIST() {
		arraylist = new ArrayList<book>();
	}

	public boolean checkbook(book b) {
		for (int i = 0; i < arraylist.size(); i++)
			if (arraylist.get(i).getbookid().equals(b.getbookid()))
				return false;
		arraylist.add(b);
		return true;
	}
}