import java.util.*;
public class MovieWatchlist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Movie> movies = new ArrayList<>();

        int option;

        while (true) {
            System.out.println("--- Movie Watchlist ---");

            System.out.println("1. Add a movie");
            System.out.println("2. Mark a movie as watched");
            System.out.println("3. View unwatched movies");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            option = input.nextInt();
            input.nextLine();

            if (option < 1 || option > 4) {
                System.out.println("Invalid choice. Please choose only from 1-4.");
                continue;
            }

            if (option == 4) {
                System.out.println("Goodbye!");
                break;
            }

            if (option == 1) {
                System.out.print("Enter movie title: ");
                String title = input.nextLine();
                movies.add(new Movie(title));
                System.out.println('"' + title + '"' + " has been added to your watchlist.");
            }

            System.out.println();
        }
        
        for (Movie movie: movies) {
            System.out.println(movie.getTitle());
        }
    }
}
