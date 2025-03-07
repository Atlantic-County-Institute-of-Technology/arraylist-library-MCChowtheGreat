import java.util.ArrayList;
import java.util.Random;

public class Libary {
    ArrayList<String> collection = new ArrayList<>();

    public void addItem(String item) {
collection.add(item);
    }

    public boolean isEmpty(){
        return collection.isEmpty();

    }
    public void removeItem(String item) {

        collection.remove(item);
        }
    public String getNextItem() {
        if (collection.isEmpty()) {
            return "Libary is empty.";
        }

        else {
            return collection.get(0);
        }
    }

    public void skipNextItem() {
        if (!collection.isEmpty()){
            collection.remove(0);
        }
    }

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

    public void shuffle() {
        Random rand = new Random();
        for ( int i = collection.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = collection.get(j);
            collection.set(i, collection.get(j));
            collection.set(j, temp);
        }
        }

    public int find(String item) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }
    }



