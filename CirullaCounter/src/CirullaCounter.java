import java.util.Scanner;

public class CirullaCounter {

    public static String getPlayerName(int number) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(String.format("Nome player %d: ", number));
            String name = scanner.nextLine();
            return name;
        }
    }

    public static int getPlayerNum(String type, String name) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(String.format("Inserisci il numero di %s di %s: ", type, name));
            int cards = scanner.nextInt();
            return cards;
        }
    }

    public static int check(int player1Value, int player2Value, String type, int max, String name) {

        while (!(player1Value + player2Value == max)) {
            System.out.println(String.format("Il numero di %s non è uguale a %d, riconteggiate le carte", type, max));
            player1Value = getPlayerNum(type, name);
            player2Value = getPlayerNum(type, name);§
        }

        if (player1Value > player2Value) {
            return 1;
        } else if (player1Value < player2Value) {
            return 2;
        }

        return 0;
    }

    public static void main(String[] args) {

        int player1Points = 0;
        int player2Points = 0;

        // Get players name
        System.out.println("Benvenuti nel calcolatore di punti per Cirulla! Inserire i nomi dei due giocatori.");
        String player1 = getPlayerName(1);
        String player2 = getPlayerName(2);

        System.out.println(String.format("Ciao %s e %s, iniziamo il gioco!", player1, player2));

        // Get players cards

        int player1Cards = getPlayerNum("carte", player1);
        int player2Cards = getPlayerNum("carte", player2);

        if (check(player1Cards, player2Cards, "carte", 40, player1) == 1) {
            player1Points++;
        } else if (check(player1Cards, player2Cards, "carte", 40, player2) == 2) {
            player2Points++;
        }

        System.out.println(
                String.format("Punti di %s: %d\nPunti di %s: %d", player1, player1Points, player2, player2Points));

        // DENARI

        int player1Denari = getPlayerNum("denari", player1);
        int player2Denari = getPlayerNum("denari", player2);

        if (check(player1Denari, player2Denari, "denari", 10, player1) == 1) {
            player1Points++;
        } else if (check(player1Denari, player2Denari, "denari", 10, player2) == 2) {
            player2Points++;
        }

        System.out.println(
                String.format("Punti di %s: %d\nPunti di %s: %d", player1, player1Points, player2, player2Points));

        // PRIMIERA

        int player1Seven = getPlayerNum("sette", player1);
        int player2Seven = getPlayerNum("sette", player2);

        if (!(player1Seven + player2Seven == 4)) {
            while (!(player1Seven + player2Seven == 4)) {
                System.out.println(
                        String.format("Il numero di sette non è uguale a 4, riconteggiate le carte"));
                player1Seven = getPlayerNum("sette", player1);
                player2Seven = getPlayerNum("sette", player2);
            }
        } else {
            if (player1Seven == player2Seven) {
                int player1Six = getPlayerNum("sei", player1);
                int player2Six = getPlayerNum("sei", player2);

                while (!(player1Six + player2Six == 4)) {
                    System.out.println(
                            String.format("Il numero di sei non è uguale a 4, riconteggiate le carte"));
                    player1Six = getPlayerNum("sei", player1);
                    player2Six = getPlayerNum("sei", player2);
                }

                if (!(player1Six + player2Six == 4)) {
                    while (!(player1Six + player2Six == 4)) {
                        System.out.println(
                                String.format("Il numero di sei non è uguale a 4, riconteggiate le carte"));
                        player1Six = getPlayerNum("sei", player1);
                        player2Six = getPlayerNum("sei", player2);
                    }
                } else {
                    if (player1Six > player2Six) {
                        player1Points++;
                    } else if (player1Six < player2Six) {
                        player2Points++;
                    } else if (player1Six == player2Six) {
                        // TODO: continue from here
                    }
                }
        
                }

            }

            System.out.println(
                    String.format("Punti di %s: %d\nPunti di %s: %d", player1, player1Points, player2, player2Points));
        }
        // RE BELLO

        // SETTE BELLO

        // SCOPE

        // PICCOLA

        // GRANDE

    }
}