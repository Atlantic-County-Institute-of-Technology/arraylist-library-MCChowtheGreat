import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Libary libary = new Libary();
    Scanner scanner = new Scanner(System.in);
    String currentlyPlaying = "";

    System.out.println("Choose an option: Play, Skip, Add, Remove, Sort, Shuffle, Find, Exit");
    String choice = scanner.nextLine();

    if (choice.equals("Play")) {
        if (!libary.isEmpty()) {
            currentlyPlaying = libary.getNextItem();
            libary.skipNextItem();
            System.out.println("Now Playing: " + currentlyPlaying);
        }
        else {
            System.out.println("Libary is empty");
        }
    }
    else if (choice.equals("Skip")){
        libary.skipNextItem();
        System.out.println("Skipped the next item.");
        }
    else if (choice.equals("Add")){
        System.out.println("Enter item to add: ");
        String addItem = scanner.nextLine();
        libary.addItem(addItem);
        System.out.println(addItem + " added to the libary.");
    }

    }
}