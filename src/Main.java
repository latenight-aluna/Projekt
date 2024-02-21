import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SENTINEL = 2;
        int loopInput = 0;

        Scanner scanner = new Scanner(System.in);

        MovieCollection myCollection = new MovieCollection();

        System.out.println("Velkommen til din filmsamling");

        while (loopInput != SENTINEL) {
            System.out.println("1. Opret film");
            System.out.println("2. Afslut");
            loopInput = scanner.nextInt();

            if (loopInput == 1) {
                System.out.println("Indtast filmoplysninger:");

                System.out.println("Titel:");
                String title = scanner.nextLine(); // brug nextLine() for at forhindre en fejl ved indlæsning af næste linje

                System.out.println("Instruktør:");
                String director = scanner.nextLine();

                System.out.println("Udgivelsesår:");
                int yearCreated = scanner.nextInt();

                System.out.println("Er filmen i farver? (skriv true for ja eller false for nej):");
                boolean isInColor = scanner.nextBoolean();

                System.out.println("Længde i minutter:");
                int lengthInMinutes = scanner.nextInt();

                System.out.println("Genre:");
                String genre = scanner.next();

                // Tilføj film til samling
                myCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                System.out.println("Film tilføjet til din filmsamling.");
            } else if (loopInput == 2) {
                System.out.println("Afslutter...");
                break;
            } else {
                System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }

        scanner.close();
    }
}