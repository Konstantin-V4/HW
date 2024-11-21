package HomeWorks.Football;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player1 = new Player(10);
        Player player2 = new Player(9);
        Player player3 = new Player(10);

        Player player4 = new Player(9);
        Player player5 = new Player(10);
        Player player6 = new Player(9);


        Player selectPlayer;
        while (true) {
            System.out.print("Введите номер игрока: ");
            String takePlayer = sc.nextLine();

            selectPlayer = switch (takePlayer) {
                case "1" -> player1;
                case "2" -> player2;
                case "3" -> player3;
                case "4" -> player4;
                case "5" -> player5;
                case "6" -> player6;
                default -> null;
            };
            playerInfo(selectPlayer);
        }

    }

    static void playerInfo(Player player) {
        if (player == null) {
            return;
        }
        player.run();
        player.info();
    }
}
