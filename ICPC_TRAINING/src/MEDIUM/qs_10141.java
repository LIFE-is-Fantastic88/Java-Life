package MEDIUM;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class qs_10141 {
	private static class proposal {
		double cost;
		double item;
		String brand;

		public proposal(double cost, double item, String brand) {
			this.cost = cost;
			this.item = item;
			this.brand = brand;
		}

		double costc() {
			return cost;
		}

		double itemc() {
			return item;
		}

		String brandc() {
			return brand;
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		while (true) {
			StringTokenizer token = new StringTokenizer(bf.readLine().trim());
			
			double itemamt = Double.parseDouble(token.nextToken());
			proposal[] proposal = new proposal[Integer.parseInt(token.nextToken())];
			if (itemamt == 0 && proposal.length == 0) {
				break;
			}
			
			for (int z = 0; z < itemamt; z++) {
				bf.readLine();
			}
			if (num > 1) {
				System.out.println();
			}
			
			for (int x = 0; x < proposal.length; x++) {
				String brand = bf.readLine();
				StringTokenizer token1 = new StringTokenizer(bf.readLine().trim());
				double cost = Double.parseDouble(token1.nextToken());
				double item = Double.parseDouble(token1.nextToken());
				proposal[x] = new proposal(cost, item, brand);
				for (int z = 0; z < item; z++) {
					bf.readLine();
				}
			}
			ArrayList<Integer> arr = new ArrayList<>();
			ArrayList<Integer> arr1 = new ArrayList<>();
			double max = 0;
			System.out.println("RFP #" + num);
			
			for (int p = 0; p < proposal.length; p++) {
				if (proposal[p].item > max) {
					max = proposal[p].item;
				}
			}
			for (int p = 0; p < proposal.length; p++) {
				if (proposal[p].item == max) {
					arr.add(p);
				}
			}
			double min = 100000000;
			if (arr.size() == 1) {
				System.out.println(proposal[arr.get(0)].brand);
			} else {
				for (int q = 0; q < arr.size(); q++) {
					if (proposal[arr.get(q)].cost < min) {
						min = proposal[arr.get(q)].cost;
					}
				}
				for (int q = 0; q < arr.size(); q++) {
					if (proposal[arr.get(q)].cost == min) {
						arr1.add(arr.get(q));
					}
				}
				if (arr1.size() == 1) {
					System.out.println(proposal[arr1.get(0)].brand);
				} else {
					System.out.println(proposal[arr1.get(0)].brand);
				}
			}
			num++;
		}

	}

}
