package comm.Bookrecs;
import java.util.Scanner;

public class BookGenreSelection extends Summary {

    private static final Scanner scanner = new Scanner(System.in);
    String genre;
    String selectedGenre;

    public static void printmain () {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Consume the newline character left in the buffer
        scanner.nextLine();

        // Variable to track if a valid book genre has been selected
        boolean validGenreSelected = false;

        // Variable to store the selected genre
        String selectedGenre = "";

        // Loop until a valid book genre is selected
        while (!validGenreSelected) {
            // Prompt the user to choose a number for the book genre
            System.out.println("\nChoose a number from 1 to 11 for the book genre:");
            System.out.println("\n1. Fantasy Fiction");
            System.out.println("2. Historical Fiction");
            System.out.println("3. Thriller/Horror");
            System.out.println("4. Non-Fiction");
            System.out.println("5. Comic Books");
            System.out.println("6. Self-Help");
            System.out.println("7. Young Adult");
            System.out.println("8. Manga");
            System.out.println("9. Mystery");
            System.out.println("10. Cook Books");
            System.out.println("11. Adult-Dark Romance");

            // Get the user's choice for the book genre
            System.out.print("\nEnter your choice: ");
            int genreChoice = scanner.nextInt();

            // Consume the newline character left in the buffer
            scanner.nextLine();

            // Determine the selected genre based on the user's choice
            switch (genreChoice) {
                case 1:
                    selectedGenre = "Fantasy Fiction";
                    validGenreSelected = true;
                    break;
                case 2:
                    selectedGenre = "Historical Fiction";
                    validGenreSelected = true;
                    break;
                case 3:
                    selectedGenre = "Thriller/Horror";
                    validGenreSelected = true;
                    break;
                case 4:
                    selectedGenre = "Non-Fiction";
                    validGenreSelected = true;
                    break;
                case 5:
                    selectedGenre = "Comic Books";
                    validGenreSelected = true;
                    break;
                case 6:
                    selectedGenre = "Self-Help";
                    validGenreSelected = true;
                    break;
                case 7:
                    selectedGenre = "Young Adult";
                    validGenreSelected = true;
                    break;
                case 8:
                    selectedGenre = "Manga";
                    validGenreSelected = true;
                    break;
                case 9:
                    selectedGenre = "Mystery";
                    validGenreSelected = true;
                    break;
                case 10:
                    selectedGenre = "Cook Books";
                    validGenreSelected = true;
                    break;
                case 11:
                    selectedGenre = "Adult-Dark Romance";
                    validGenreSelected = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid number.");
            }
        }

        // Display the user's information and selected book genre
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Selected Book Genre: " + selectedGenre);
    }
}
