import java.util.Objects;
import java.util.Scanner;

public class vecchiume {

    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static int getPlayerNum(String type) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(String.format("Enter the number of %s: ", type));
        int cards = scanner.nextInt();
        return cards;
    }

    public static void main(String[] args) {

        int player1Poitns = 0;
        int player2Poitns = 0;

        // Get players name
        System.out.println("Benvenuti nel calcolatore di punti per Cirulla! Inserire i nomi dei due giocatori.");
        String player1 = getPlayerName();
        String player2 = getPlayerName();

        // Get players cards
        System.out.println("Inserire il numero di carte per ogni giocatore.");

        int player1Cards = getPlayerNum("carte");
        int player2Cards = getPlayerNum("carte");

        while (!(player1Cards + player2Cards == 40)) {
            System.out.println("Il numero di carte supera 40, riprova.");
            player1Cards = getPlayerNum("carte");
            player2Cards = getPlayerNum("carte");
        }

        if (player1Cards == player2Cards) {
            continue;
        } else if (player1Cards > player2Cards) {
            player1Poitns++;
        } else {
            player2Poitns++;
        }

        System.out.println(
                String.format("Punti di %s: %d\nPunti di %s: %d", player1, player1Poitns, player2, player2Poitns));

        // DENARI

        int player1Seven = getPlayerNum("denari");
        int player2Denari = getPlayerNum("denari");

        while (!(player1Denari + player2Denari == 10)) {
            System.out.println("Il numero di denari supera 10, riprova.");
            player1Denari = getPlayerNum("denari");
            player2Denari = getPlayerNum("denari");
        }

        if (player1Denari == player2Denari) {
            continue;
        } else if (player1Denari > player2Denari) {
            player1Poitns++;
        } else {
            player2Poitns++;
        }

        System.out.println(
                String.format("Punti di %s: %d\nPunti di %s: %d", player1, player1Poitns, player2, player2Poitns));

        // PRIMIERA
        // ! Too fix from here

        int player1Seven = getPlayerNum("sette");
        int player2Seven = getPlayerNum("sette");

        while (!(player1Seven + player2Sevem == 4)) {
            System.out.println("Il numero di carte supera 10, riprova.");
            player1Seven = getPlayerNum("sette");
            player2Seven = getPlayerNum("sette");
        }

        if (player1Seven == player2Sevem) {
            continue;
        } else if (player1Seven > player2Sevem) {
            player1Poitns++;
        } else {
            player2Poitns++;
        }

        System.out.println(
                String.format("Punti di %s: %d\nPunti di %s: %d", player1, player1Poitns, player2, player2Poitns));


        int numSei1;
        int numSei2;

        Scanner assodiCuorImput = new Scanner(System.in);
        String assoDiCuori = "";

        if (numSette1 == numSette2) {
            System.out.println("Quanti Sei Avete?");
            numSei1 = scanner.nextInt();
            numSei2 = scanner.nextInt();

            while (numSei1 + numSei2 != 4) {
                System.out.println("Avete sbagliato a contare Riprova");
                numSette1 = scanner.nextInt();
                numSette2 = scanner.nextInt();
            }

            if (numSei1 > numSei2) {
                pointP1++;
                System.out.println(pointP1 + "-" + pointP2);
            }
            if (numSei1 < numSei2) {
                pointP2++;
                System.out.println(pointP1 + "-" + pointP2);
            }

            if (numSei1 == numSei2) {
                System.out.println("Chi ha l'asso di cuori?");
                assoDiCuori = assodiCuorImput.nextLine();
            }
            if (Objects.equals(assoDiCuori, namePlayer1)) {
                pointP1++;
                System.out.println(pointP1 + "-" + pointP2);
            }
            if (Objects.equals(assoDiCuori, namePlayer2)) {
                pointP2++;
                System.out.println(pointP1 + "-" + pointP2);
            }
        }

        // RE BELLO

        System.out.println("Chi ha il Re Bello");

        Scanner reBelloImput = new Scanner(System.in);
        String reBelloName = reBelloImput.nextLine();

        if (Objects.equals(reBelloName, namePlayer1)) {
            pointP1++;
            System.out.println(pointP1 + "-" + pointP2);
        }
        if (Objects.equals(reBelloName, namePlayer2)) {
            pointP2++;
            System.out.println(pointP1 + "-" + pointP2);

        }

        // SETTE BELLO

        System.out.println("Chi ha il Sette Bello");

        Scanner setteBelloImput = new Scanner(System.in);
        String setteBelloName = setteBelloImput.nextLine();

        if (Objects.equals(setteBelloName, namePlayer1)) {
            pointP1++;
            System.out.println(pointP1 + "-" + pointP2);
        }
        if (Objects.equals(setteBelloName, namePlayer2)) {
            pointP2++;
            System.out.println(pointP1 + "-" + pointP2);

        }

        // SCOPE

        System.out.println("Quante Scope avete?");

        int numScope1 = scanner.nextInt();
        int numScope2 = scanner.nextInt();

        int pointP11 = pointP1 + numScope1;
        int pointP22 = pointP2 + numScope2;

        System.out.println(pointP11 + "-" + pointP22);

        // PICCOLA

        System.out.println("Qualcuno ha la Piccola?");

        Scanner piccolaImput = new Scanner(System.in);
        String piccolaName = piccolaImput.nextLine();

        if (piccolaName == "no") {
            System.out.println(pointP11 + "-" + pointP22);
        }

        int numPiccola;
        int pointP111;
        int pointP222;

        if (Objects.equals(piccolaName, namePlayer1)) {
            System.out.println("Fino a che numero?");
            numPiccola = piccolaImput.nextInt();
            pointP111 = pointP11 + numPiccola;
            System.out.println(pointP111 + "-" + pointP22);
        }
        if (Objects.equals(piccolaName, namePlayer2)) {
            System.out.println("Fino a che numero?");
            numPiccola = piccolaImput.nextInt();
            pointP222 = pointP22 + numPiccola;
            pointP111 = pointP11;
            System.out.println(pointP111 + "-" + pointP222);
        }

        // GRANDE

        // System.out.println("Qualcuno ha la Grande?");

        // Scanner grandeImput = new Scanner(System.in);
        // String grandeName = grandeImput.nextLine();

        // if (grandeName == "no") {

        // System.out.println(pointP111 + "-" + pointP222);
        // }
        // if (Objects.equals(grandeName, namePlayer1)) {
        // System.out.println("5-0");

        // }
        // if (Objects.equals(grandeName, namePlayer2)) {
        // System.out.println("0-5");

        // }

    }
}