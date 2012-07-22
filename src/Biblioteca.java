import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public static void main(String[] args) throws IOException {
        System.out.println(displayWelcomeMessage());
        List<Book> libraryBooks = new ArrayList<Book>();
        libraryBooks.add(new Book("Robin Hood", "Kevin Reynolds", "9029302930"));
        libraryBooks.add(new Book("Craig Wattrus", "Charles Kimpolo", "90293029211"));
        List<Movie> libraryMovies = new ArrayList<Movie>();
        libraryMovies.add(new Movie("SholayRamesh", "Sippy", "N/A"));
        List<User>  libraryUsers = new ArrayList<User>();
        libraryUsers.add(new User("Librarian", "librarianPassword"));
        libraryUsers.add(new User("UserTwo","userTwoPassword"));
        Library library = new Library(libraryBooks, libraryMovies, libraryUsers);

        Boolean exit = false;
        while(!exit) {
            System.out.println(displayListOfMenuOptionTypes());
            System.out.println("Please enter a menu option type: " );
            String menuOptionTypeSelection = userMenuOptionType();
            if (menuOptionTypeSelection.equals("Error")) {
                System.out.println("Sorry! There was an error, try again.");
            }
            else {
                if(menuOptionTypeSelection.equalsIgnoreCase("1")){
                    Boolean exitBooksMenu = false;
                    while(!exitBooksMenu) {
                        System.out.println(displayListOfMenuOptions());
                        System.out.println("Please enter a books menu option: " );
                        String menuOptionSelection = userSelection();
                        if (menuOptionSelection.equals("Error")) {
                            System.out.println("Sorry! There was an error, try again.");
                        }
                        else {
                            if(menuOptionSelection.equalsIgnoreCase("1")){
                                System.out.println(library.checkLibraryNumber());
                            }
                            else if (menuOptionSelection.equalsIgnoreCase("2")){
                                System.out.println(library.listBooks());
                            }
                            else if (menuOptionSelection.equalsIgnoreCase("3")) {
                                System.out.println("Enter a book number");
                                String userBookSelection = userSelection();
                                System.out.println(library.reserveBook(Integer.valueOf(userBookSelection)));
                            }
                            else if(menuOptionSelection.equalsIgnoreCase("4")) {
                                exitBooksMenu = true;
                            }
                            else {
                                System.out.println("Select a valid option!");
                            }
                        }
                    }

                }

                else {
                    if (menuOptionTypeSelection.equalsIgnoreCase("2")){
                        System.out.println(library.displayListOfMovies());
                         }
                    else {
                        if (menuOptionTypeSelection.equalsIgnoreCase("3")){
                            exit = true;
                         }
                        else {

                            if (menuOptionTypeSelection.equalsIgnoreCase("4")) {
                                Boolean exitOtherOperationsMenu = false;
                                while (!exitOtherOperationsMenu) {
                                System.out.println(library.displayMenuOfOtherOperations());
                                System.out.println("Enter a menu option: " );
                                String menuOptionSelection = userSelection();
                                if (menuOptionSelection.equals("Error")) {
                                    System.out.println("Sorry! There was an error, try again.");
                                }
                                else {
                                    if(menuOptionSelection.equalsIgnoreCase("1")){
                                        System.out.println("Please enter your username:");
                                        String userName = getUsername();
                                        System.out.println("Please enter your password:");
                                        String userPassword = getUserPassword();
                                        User givenUser = new User(userName, userPassword);
                                        if (givenUser.authenticateUser()) {
                                            System.out.println("Your library number is: Librian");
                                        }
                                        else {
                                            System.out.println("Sorry! There was an error, talk to your librarian");
                                        }
                                    }
                                    else {
                                        if(menuOptionSelection.equalsIgnoreCase("2")) {
                                           exitOtherOperationsMenu = true;
                                        }

                                        else {
                                            System.out.println("Sorry! There was an error, try again.");
                                        }
                                    }

                                   }
                                 }
                            }

                            else {
                                System.out.println("Select a valid option!");
                            }
                        }


                    }
                }
            }
        }
        System.exit(0);

    }



    private static String getUserPassword() {
        InputStreamReader userPassword = new InputStreamReader(System.in);
        BufferedReader readUserPassword = new BufferedReader(userPassword);
        String userEnteredPassword;
        try {
            userEnteredPassword = readUserPassword.readLine();
        }
        catch (IOException ex) {
            userEnteredPassword = "Error";
        }
        return userEnteredPassword;

    }

    private static String getUsername() {
        InputStreamReader userName = new InputStreamReader(System.in);
        BufferedReader readUserName = new BufferedReader(userName);
        String userEnteredName;
        try {
            userEnteredName = readUserName.readLine();
        }
        catch (IOException ex) {
            userEnteredName = "Error";
        }
        return userEnteredName;
    }


    private static String userMenuOptionType() {
        InputStreamReader userMenuOptionType = new InputStreamReader(System.in);
        BufferedReader readUserMenuOptionType = new BufferedReader(userMenuOptionType);
        String userSelectedMenuOptionType;
        try {
            userSelectedMenuOptionType = readUserMenuOptionType.readLine();
        }
        catch (IOException ex) {
            userSelectedMenuOptionType = "Error";
        }
        return userSelectedMenuOptionType;
    }

    public static String displayWelcomeMessage(){
        return "Welcome to Biblioteca!";
    }

    public static String displayListOfMenuOptions(){
        return "1) Check Library Number" + "\n" + "2) List Books" + "\n" + "3) Reserve Book"  + "\n" +  "4) Exit";
    }

    public static String displayListOfMenuOptionTypes(){

        return "1) Books Menu" + "\n" + "2) Movies Menu" + "\n"+ "3) Exit" + "\n"+ "4) Other Operation";
    }

    public static String userSelection(){
        InputStreamReader userMenuOption = new InputStreamReader(System.in);
        BufferedReader readUserMenuOption = new BufferedReader(userMenuOption);
        String userSelectedMenuOption;
        try {
             userSelectedMenuOption = readUserMenuOption.readLine();
        }
        catch (IOException ex) {
             userSelectedMenuOption = "Error";
        }
        return userSelectedMenuOption;
    }

}