import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Library queue = new Library();  //calls for the library class
    Scanner scanner = new Scanner(System.in);   //Lets user input things
    String currentlyPlaying = "";

    //Added songs to test the code below
    queue.addItem("Hot n Cold");
    queue.addItem("Bad Romance");
    queue.addItem("Poker Face");
    queue.addItem("Last Friday Night");
    queue.addItem("S&M");

    //loops the code until otherwise
        boolean loop = true;
    while (loop) {

        System.out.println("Choose an option: Play, Skip, Add, Remove, Sort, Shuffle, Find, Exit"); //Tells the user what they can pick from
        String choice = scanner.nextLine(); //User can type, case-sensitive

        //If user types in "Play" and the queue is not empty the current song in the list will play
        if (choice.equals("Play")) {
            if (!queue.isEmpty()) {
                currentlyPlaying = queue.getNextItem();
                queue.skipNextItem();
                System.out.println("Now Playing: " + currentlyPlaying);
            } else {
                System.out.println("Queue is empty"); //If queue is empty this line will print
            }
        }

        //If user types in "Skip" the song currently playing will skip on to the next
        else if (choice.equals("Skip")) {
            queue.skipNextItem();
            System.out.println("Skipped the next item.");
        }
        //If user types in "Add" then another prompts comes up to add another value which will then be added to the queue
        else if (choice.equals("Add")) {
            System.out.println("Enter item to add: ");
            String addItem = scanner.nextLine();
            queue.addItem(addItem);
            System.out.println(addItem + " has been added to the queue.");
        }
        //If user types in "Remove" then another prompts comes up to remove a value from the list.
        else if (choice.equals("Remove")) {
            System.out.println("Enter item to remove: ");
            String removeItem = scanner.nextLine();
            queue.removeItem(removeItem);
            System.out.println(removeItem + " has been removed to the queue.");
        }
        //If user types in "Sort" the queue will be sorted in alphabetic order.
        else if (choice.equals("Sort")) {
            queue.sortAlphabet();
            System.out.println("Queue sorted");
        }
        //If user types in "Shuffle" the queue gets shuffled
        else if (choice.equals("Shuffle")) {
            queue.shuffle();
            System.out.println("Queue has been shuffled");
        }
        //If user types in "Find" another prompts comes up for the user to type in the song, if the song is found the song is moved up to the next in queue.
        else if (choice.equals("Find")) {
            System.out.println("Enter item to find: ");
            String findItem = scanner.nextLine();
            int position = queue.find(findItem);
            if (position >= 0) {
                System.out.println(findItem + " found at position: " + position);
            }
            else {
                System.out.println(findItem + " can not be found in the queue");
            }
        }
        //If user types in "Exit" the code ends
        else if (choice.equals("Exit")){
            System.out.println("Closing program");
            scanner.close();
            break;
        }
        //If the user types anything not within the code there will be a prompt to try again.
        else {
            System.out.println("Please try again");
        }
    }
    }
}