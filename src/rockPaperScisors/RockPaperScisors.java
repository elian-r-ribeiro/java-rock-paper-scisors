package rockPaperScisors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScisors {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner input = new Scanner(System.in);

		while (true) {
			int randomNumber = random.nextInt(3);
			String iAChoice = "";

			switch (randomNumber) {
			case 0:
				iAChoice = "pedra";
				break;
			case 1:
				iAChoice = "papel";
				break;
			case 2:
				iAChoice = "tesoura";
				break;
			default:
				iAChoice = "error";
			}

			System.out.print("Escolha sua jogada (pedra, papel ou tesoura) (para sair, digite sair): ");
			String playerChoice = input.nextLine().trim().replaceAll("\\s", "");
			System.out.println("====================================");
			

			if (!playerChoice.equalsIgnoreCase("papel") && !playerChoice.equalsIgnoreCase("tesoura")
					&& !playerChoice.equalsIgnoreCase("pedra") && !playerChoice.equalsIgnoreCase("sair")) {
				System.out.println("Jogada inválida (deve ser pedra, papel ou tesoura)!");
			} else if (playerChoice.equalsIgnoreCase("sair")) {
				System.out.println("Até a próxima! :)");
				System.out.println("====================================");
				break;
			} else {
				System.out.printf("Sua jogada foi: %s\n", playerChoice);
				System.out.printf("A jogada da IA foi: %s\n", iAChoice);

				if (iAChoice.equals("pedra") && playerChoice.equalsIgnoreCase("papel")) {
					System.out.println("Você venceu!");
					System.out.println("====================================");
				} else if (iAChoice.equals("papel") && playerChoice.equalsIgnoreCase("tesoura")) {
					System.out.println("Você venceu!");
					System.out.println("====================================");
				} else if (iAChoice.equals("tesoura") && playerChoice.equalsIgnoreCase("pedra")) {
					System.out.println("Você venceu!");
					System.out.println("====================================");
				} else if (playerChoice.equalsIgnoreCase(iAChoice)) {
					System.out.println("Empate!");
					System.out.println("====================================");
				} else {
					System.out.println("Você perdeu!");
					System.out.println("====================================");
				}
			}
		}

		input.close();
	}
}
