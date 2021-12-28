import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LIBRARY_SYSTEM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("###### Nilai Program ######\n");
		System.out.print("Enter Student ID >> ");
		String id = sc.nextLine();
		System.out.print("Enter Name >> ");
		String name = sc.nextLine();
		System.out.print("Enter School Name >> ");
		String schoolname = sc.nextLine();
		System.out.println();
		System.out.print("MENU OPTION :\n1. Add book\n2. Reward Plan\n3. Display Details\n0. Exit >>");
		student mystudent = new student(id, name, schoolname);

		int sum = 0;
		int inf = 1;

		MYLIBRARYLIST library = new MYLIBRARYLIST();
		for (int n = 1; n <= inf; inf++) {
			int input = sc.nextInt();//
			if (input == 0) {
				break;
			}
			book mybook = new book();

			if (input == 1) {
				System.out.println();
				System.out.print("Enter BookID               >> ");
				String bookid = sc.nextLine();
				sc.nextLine();
				mybook.addbookid(bookid);
				if(library.checkbook(mybook)) {
					}else {
					JOptionPane.showMessageDialog(null, "You enter the same book");
				}
				System.out.print("Enter Title                >> ");
				String title = sc.nextLine();

				System.out.print("Which category? A/B/C      >> ");
				String category = sc.nextLine();

				mybook.addbook(title, category);
				sum += mybook.addpoint();
				System.out.println("\n** New Book successfully added.\nCurrent points: " + sum);
				mystudent.calculatepoint(sum);

			} else if (input == 2) {
				mybook.updateAwardType(sum);
			} else if (input == 3) {
				System.out.println("========Summary========");
				System.out.println();
				String iddata = mystudent.getid();
				String namedata = mystudent.getName();
				String schooldata = mystudent.getSchool();
				int pointdata = mystudent.getPoint();
				String awarddata = mystudent.getAward();
				System.out.println("Student ID        : " + iddata);
				System.out.println("Student Name      : " + namedata);
				System.out.println("Current point     : " + pointdata);
				System.out.println("Achievement Award : " + awarddata);
			} else if (input == 0) {
				break;
			} else if (input != 0 && input != 1 && input != 2 && input != 3) {
				JOptionPane.showMessageDialog(null,
						"ERROR\nYOU INPUT IS OUT OF THE MENU OPTION.\nPlease enter again your option");
			}
		}
	}
}
	

class book {
	private String bookid;
	private String title;
	private String category;
	private int point;
	private String awardtype;

	public book() {
		point = 0;
		awardtype = "none";
	}

	public book(String bookid, String title, String category) {
		this.bookid = bookid;
		this.title = title;
		this.category = category;
	}

	void addbookid(String id) {
		this.bookid = id;
	}

	void addbook(String title, String category) {

		this.title = title;
		this.category = category;
	}

	String getbookid() {
		return bookid;
	}

	int addpoint() {
		if (category.equals("A") || category.equals("a")) {
			point = 70;
		} else if (category.equals("B") || category.equals("b")) {
			point = 55;
		} else if (category.equals("C") || category.equals("c")) {
			point = 30;
		} else if (category.equals("others") || category.equals("other")) {
			point = 10;
		}
		return point;
	}

	void updateAwardType(int sum) {
		if (sum < 90) {
			System.out.println("\n## Not Qualified ##\nSorry, your points are not enough for Reward Plan");
		} else if (sum >= 90 && sum <= 159) {
			System.out.println("\n** You have successfully archieve the Award\nPlan Current points: " + sum
					+ "\n Achievement Award: Bronze");
		} else if (sum >= 160 && sum <= 259) {
			System.out.println("\n** You have successfully archieve the Award\nPlan Current points: " + sum
					+ "\n Achievement Award: Silver");
		} else if (sum >= 260 && sum <= 359) {
			System.out.println("\n** You have successfully archieve the Award\nPlan Current points: " + sum
					+ "\n Achievement Award: Gold");
		} else if (sum >= 360) {
			System.out.println("\n** You have successfully archieve the Award\nPlan Current points: " + sum
					+ "\n Achievement Award: NILAM AWARD");
		}
	}
}

class student {
	private String studentid;
	private String name;
	private String school;
	private int point;

	public student(String studentid, String name, String school) {
		this.studentid = studentid;
		this.name = name;
		this.school = school;
	}

	String getid() {
		return studentid;
	}

	String getName() {
		return name;
	}

	String getSchool() {
		return school;
	}

	void calculatepoint(int sum) {
		this.point = sum;
	}

	int getPoint() {
		return point;
	}

	String getAward() {
		String data = new String();
		if (point < 90) {
			data = "none";
		} else if (point >= 90 && point <= 159) {
			data = "Bronze";
		} else if (point >= 160 && point <= 259) {
			data = "Silver";
		} else if (point >= 260 && point <= 359) {
			data = "Gold";
		} else if (point >= 360) {
			data = "NILAM AWARD";
		}
		return data;
	}
}


