import java.util.ArrayList;
import java.util.Scanner;

public class testerclass {

	public static void main(String[] args) {
		int person1 = 0;
		int person2 = 0;
		int person3 = 0;
		int person4 = 0;
		int person5 = 0;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(person1);
		arr.add(person2);
		arr.add(person3);
		arr.add(person4);
		arr.add(person5);

		int claim = 0;
		int inf = 0;
		for (int z = 0; z < inf; inf++) {
			int remain = 0;
			for (int x = 0; x < arr.size(); x++) {

				if (claim < 3) {
					claim++;
					int money = arr.get(z);

					if (remain != 0) {
						money += remain;
						remain = 0;
						arr.set(z, money);
					} else {
						money += claim;
						arr.set(z, money);
					}
					if (money > 40) {
						remain = money - 40;
					}

					if (money >= 40) {
						System.out.println(x);
						
					}
				} else if (claim > 3) {
					claim = 0;

				}
			}
		}
	}

}

  