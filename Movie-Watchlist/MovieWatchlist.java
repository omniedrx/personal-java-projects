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
                System.out.println("Invalid choice. Choose only 1-4.");
                continue;
            } else if (option == 4) {
                System.out.println("Goodbye!");
                break;
            } else if (option == 1) {
                System.out.print("Enter movie title: ");
                String title = input.nextLine();
                movies.add(new Movie(title));
                System.out.println('"' + title + '"' + " has been added to your watchlist.");
            } else if (option == 2) {
                System.out.print("Enter movie title: ");
                String title = input.nextLine();
                boolean titleInList = false;

                for (Movie movie: movies) {
                    if (movie.getTitle().equalsIgnoreCase(title)) {
                        titleInList = true;
                        movie.markAsWatched();
                        System.out.println('"' + title + '"' + " has been marked as watched.");
                    }
                }

                if (!titleInList) {
                    System.out.println('"' + title + '"' + " was not found in your watchlist.");
                }
            } else if (option == 3) {
                System.out.println();
                int num = 1;
                System.out.println("Unwatched movies:");
                for (Movie movie: movies) {
                    if (!movie.isWatched()) {
                        System.out.println(num + ". " + movie.getTitle());
                        num++;
                    }
                }
            }

            System.out.println();
        }

        input.close();
    }
}
