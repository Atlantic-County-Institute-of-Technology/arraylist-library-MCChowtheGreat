import java.util.ArrayList;
import java.util.Random;

public class Library {
    ArrayList<String> collection = new ArrayList<>();  //Creates array list to hold information

    public void addItem(String item) {  //Used to add items to Library
collection.add(item);
    }

    public boolean isEmpty(){  //Used when the Library is empty
        return collection.isEmpty();

    }
    public void removeItem(String item) { //Used to remove items in the library

        collection.remove(item);
        }
    public String getNextItem() {       //Used to get the next item in the library before the one being played.
        if (collection.isEmpty()) {     //If there was nothing there the library returns empty
            return "Library is empty.";
        }

        else {
            return collection.get(0);
        }
    }

    public void skipNextItem() {        //Used to skip the current thing playing
        if (!collection.isEmpty()){     //If collection is not empty remove the next song
            collection.remove(0);
        }
    }

    //Sorts the queue in alphabetic order using bubble sorts by creating temp and swaping the words.
    public void sortAlphabet() {
        int n = collection.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (collection.get(j).compareTo(collection.get(j + 1)) > 0) {
                    String temp = collection.get(j);
                    collection.set(j, collection.get(j + 1));
                    collection.set(j + 1, temp);
                }
            }
        }
    }

    //Shuffles the list in the library using a loop that swaps all the positions of the values in the list.
    public void shuffle() {
        Random rand = new Random();
        for (int i = collection.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = collection.get(i);
            collection.set(i, collection.get(j));
            collection.set(j, temp);
        }
        }
//Used to find whatever is in the queue and moves it up to next in queue.
    public int find(String item) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }
    }



