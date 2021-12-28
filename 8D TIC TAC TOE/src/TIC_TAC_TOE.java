import java.util.Scanner;

public class TIC_TAC_TOE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arr[][] = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		int inf = 1;
		String player1 = "X";
		String player2 = "O";
		System.out.println("player1:" + player1 + " " + "player2:" + player2);
		for (int n = 1; n <= inf; inf++) {
			if (inf % 2 != 0) {
				System.out.print("player 1 : ");
				int input1 = sc.nextInt();
				if (input1 == 1) {
					if (arr[2][0].equals(" ")) {
						arr[2][0] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);

						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {

							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 2) {
					if (arr[2][1].equals(" ")) {
						arr[2][1] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 3) {
					if (arr[2][2].equals(" ")) {
						arr[2][2] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 4) {
					if (arr[1][0].equals(" ")) {
						arr[1][0] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 5) {
					if (arr[1][1].equals(" ")) {
						arr[1][1] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 6) {
					if (arr[1][2].equals(" ")) {
						arr[1][2] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 7) {
					if (arr[0][0].equals(" ")) {
						arr[0][0] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				} else if (input1 == 8) {
					if (arr[0][1].equals(" ")) {
						arr[0][1] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}

				} else if (input1 == 9) {
					if (arr[0][2].equals(" ")) {
						arr[0][2] = player1;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player1) && arr[0][1].equals(player1) && arr[0][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[1][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[1][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[2][0].equals(player1) && arr[2][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][0].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][1].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][1].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][2].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][0].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][2].equals(player1)) {
							System.out.println("Player1 win");
							break;
						} else if (arr[0][2].equals(player1) && arr[1][1].equals(player1)
								&& arr[2][0].equals(player1)) {
							System.out.println("Player1 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 2 slot......YOU LOSE");
						break;
					}
				}
			} else if (inf % 2 == 0) {
				System.out.print("player 2 : ");
				int input2 = sc.nextInt();
				if (input2 == 1) {

					if (arr[2][0].equals(" ")) {
						arr[2][0] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				}

				else if (input2 == 2) {
					if (arr[2][1].equals(" ")) {
						arr[2][1] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				} else if (input2 == 3) {
					if (arr[2][2].equals(" ")) {
						arr[2][2] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				} else if (input2 == 4) {
					if (arr[1][0].equals(" ")) {
						arr[1][0] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} 
					}else {
							System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
							break;
						

					}
				} else if (input2 == 5) {
					if (arr[1][1].equals(" ")) {

						arr[1][1] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				} else if (input2 == 6) {
					if (arr[1][2].equals(" ")) {

						arr[1][2] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				} else if (input2 == 7) {
					if (arr[0][0].equals(" ")) {

						arr[0][0] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}

				} else if (input2 == 8) {
					if (arr[0][1].equals(" ")) {
						arr[0][1] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				} else if (input2 == 9) {
					if (arr[0][2].equals(" ")) {
						arr[0][2] = player2;
						System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
						System.out.println("-+-+-");
						System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
						System.out.println("-+-+-");
						System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
						if (arr[0][0].equals(player2) && arr[0][1].equals(player2) && arr[0][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[1][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[1][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[2][0].equals(player2) && arr[2][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][0].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][1].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][1].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][2].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][0].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][2].equals(player2)) {
							System.out.println("Player2 win");
							break;
						} else if (arr[0][2].equals(player2) && arr[1][1].equals(player2)
								&& arr[2][0].equals(player2)) {
							System.out.println("Player2 win");
							break;
						}
					} else {
						System.out.print("you this asshole key in the player 1 slot......YOU LOSE");
						break;
					}
				}
			}
			if (inf == 9) {
				System.out.print("DRAW GAME");
				break;
			}
		}
	}

}
