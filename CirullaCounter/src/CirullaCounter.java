import java.util.Objects;
import java.util.Scanner;

public class CirullaCounter {

    public static void main(String[] args) {

        // INIT SCANNER

        Scanner scanner = new Scanner(System.in);

        // WELCOMER

        System.out.println("Benvenuti nel calcolatore di punti per Cirulla! Inserire i nomi dei due giocatori.");
        String namePlayer1 = scanner.nextLine();
        System.out.println("vs");
        String namePlayer2 = scanner.nextLine();
        System.out.println("Ciao " + namePlayer1 + " e " + namePlayer2);

        // SOMMA TOTALE

        int pointP1 = 0;
        int pointP2 = 0;

        // CARTE

        System.out.println("Quante Carte avete?");

        int numCarte1 = scanner.nextInt();
        int numCarte2 = scanner.nextInt();

        while (numCarte1 + numCarte2 != 40) {
            System.out.println("Avete sbagliato a contare Riprova");
            numCarte1 = scanner.nextInt();
            numCarte2 = scanner.nextInt();
        }

        if (numCarte1 == numCarte2) {
            System.out.println("0-0");
        } else if (numCarte1 > numCarte2) {
            pointP1++;
            System.out.println(pointP1 + "-0");
        } else {
            pointP2++;
            System.out.println("0-" + pointP2);
        }

        // DENARI

        System.out.println("Quanti Denari Avete?");

        int numDenari1 = scanner.nextInt();
        int numDenari2 = scanner.nextInt();

        while (numDenari1 + numDenari2 != 10) {
            System.out.println("Avete sbagliato a contare Riprova");
            numDenari1 = scanner.nextInt();
            numDenari2 = scanner.nextInt();
        }

        if (numDenari1 == numDenari2) {
            System.out.println(pointP1 + "-" + pointP2);
        } else if (numDenari1 > numDenari2) {
            pointP1++;
            System.out.println(pointP1 + "-" + pointP2);
        } else {
            pointP2++;
            System.out.println(pointP1 + "-" + pointP2);
        }

        // PRIMIERA

        System.out.println("Quanti Sette Avete?");

        int numSette1 = scanner.nextInt();
        int numSette2 = scanner.nextInt();


        while (numSette1 + numSette2 != 4) {
            System.out.println("Avete sbagliato a contare Riprova");
            numSette1 = scanner.nextInt();
            numSette2 = scanner.nextInt();
        }

        if (numSette1 > numSette2) {
            pointP1++;
            System.out.println(pointP1 + "-" + pointP2);
        }

        if (numSette1 < numSette2) {
            pointP2++;
            System.out.println(pointP1 + "-" + pointP2);
        }

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

        System.out.println("Qualcuno ha la Grande?");

        Scanner grandeImput = new Scanner(System.in);
        String grandeName = grandeImput.nextLine();

        if (grandeName == "no") {

            System.out.println(pointP111 + "-" + pointP222);
        }
        if (Objects.equals(grandeName, namePlayer1)) {
            System.out.println("5-0");

        }
        if (Objects.equals(grandeName, namePlayer2)) {
            System.out.println("0-5");

        }

    }
}