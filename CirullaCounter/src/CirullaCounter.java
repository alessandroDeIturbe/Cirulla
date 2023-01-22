import java.util.Scanner;
// import com.diogonunes.jcolor;

public class CirullaCounter {

    // public static String error(String message) {
    //     return colorize(message, WHITE_TEXT(), RED_BACK())
    // }

    public static String getPlayerName(int number) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(String.format("Nome player: %d: ", number));
            String name = scanner.nextLine();
            return name;
        }
    }
    
    public static int getPlayerNum(String type, String name) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(String.format("Inserisci il numero di %s di %s: ", type, name));
            String cards = scanner.nextLine();
            return cards;
        }

    }

    public static int check(int player1Value, int player2Value, String type, int max, int[] playerPoints) {
        while !(player1Value + player2Value == max) {
            System.out.println(String.format("Il numero di %s non è uguale a %d, riconteggiate le carte"))
            player1Value = getPlayerNum(type, playerPoints[0])
            player2Value = getPlayerNum(type, playerPoints[1])
        
            if (player1Value > player2Value) {
                return 0
            } else if (player1Value < player2Value) {
                return 1
            } else if (player1Value == player2) {
                return 2
            }

        }
    }

    public static void main(String[] args) {
        
        int player1Points;
        int player2Points;
        int untaken;

        int[] players = {player1Points, player2Points, untaken}

        System.out.println("Benvenuti nel calcolatore di punti per Cirulla! Inserire i nomi dei due giocatori.");
        
        String player1 = getPlayerName().toUpperCase();
        String player2 = getPlayerName().toUpperCase();

        // CARTE

        player1Cards = getPlayerNum("carte", player1);
        player2Cards = getPlayerNum("carte", player2);

        int point = check(player1Cards, player2Cards, "carte", 40, [player1, player2, untaken])
        if (point == 0) {
            player1Points++;
        } else if (point == 1) {
            player2Points++;
        } else if (point == 2) {
            untaken++;
        }

        System.out.println(String.format("\nPunti di %s: %d, Punti di %s: %d\n", player1, player1Points, player2, player2Points));
        
        // DENARI

        player1Denari = getPlayerNum("denari", player1);
        player2Denari = getPlayerNum("denari", player2);

        int point = check(player1Denari, player2Denari, "denari", 10, [player1, player2, untaken])
        if (point == 0) {
            player1Points++;
        } else if (point == 1) {
            player2Points++;
        } else if (point == 2) {
            untaken++;
        }

        System.out.println(String.format("\nPunti di %s: %d, Punti di %s: %d\n", player1, player1Points, player2, player2Points));

        // PRIMIERA

        player1Seven = getPlayerNum("sette", player1);
        player2Seven = getPlayerNum("sette", player2);

        int point = check(player1Seven, player2Seven, "sette", 4, [player1, player2, untaken])
        if (point == 0) {
            player1Points++;
        } else if (point == 1) {
            player2Points++;
        } else if (point == 2) {
            
            player1Six = getPlayerNum("sei", player1);
            player2Six = getPlayerNum("sei", player2);
    
            int point = check(player1Six, player2Six, "sei", 4, [player1, player2, untaken])
            if (point == 0) {
                player1Points++;
            } else if (point == 1) {
                player2Points++;
            } else if (point == 2) {
                
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println(String.format("Chi ha l'asso di cuori? (1:%s, 2:%s)"), player1, player2);
                    int A_cuori = scanner.nextLine();

                    if (A_cuori == 1) {
                        player1Points++;
                    } else if (A_cuori == 2) {
                        player2Points++;
                    }
                }
    
            }
    

        }

        System.out.println(String.format("\nPunti di %s: %d, Punti di %s: %d\n", player1, player1Points, player2, player2Points));
        
        // RE BELLO
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(String.format("Chi ha l'asso di cuori? (1:%s, 2:%s)"), player1, player2);
            int K_denari = scanner.nextLine();
            
            if (K_denari == 1) {
                player1Points++;
            } else if (K_denari == 2) {
                player2Points++;
            }
        }
        
        System.out.println(String.format("\nPunti di %s: %d, Punti di %s: %d\n", player1, player1Points, player2, player2Points));
        
        // SETTE BELLO
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(String.format("Chi ha l'asso di cuori? (1:%s, 2:%s)"), player1, player2);
            int K_denari = scanner.nextLine();
            
            if (K_denari == 1) {
                player1Points++;
            } else if (K_denari == 2) {
                player2Points++;
            }
        }
        
        System.out.println(String.format("\nPunti di %s: %d, Punti di %s: %d\n", player1, player1Points, player2, player2Points));
        
        // SCOPE
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(String.format("Numeri di scope di %s: "), player1);
            int player1Scope = scanner.nextLine();
            System.out.println(String.format("Numeri di scope di %s: "), player2);
            int player2Scope = scanner.nextLine();

            player1Points = player1Scope + player1Points;
            player2Points = player2Scope + player2Points;

        }
    }
        
        System.out.println(String.format("\nPunti di %s: %d, Punti di %s: %d\n", player1, player1Points, player2, player2Points));
        
        // * CONTINUARE DA QUI * 

}
