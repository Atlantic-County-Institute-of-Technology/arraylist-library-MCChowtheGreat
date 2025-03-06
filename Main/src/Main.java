import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> libary = new ArrayList<String>();

        System.out.println(libary.size());
        libary.add("Peanut Butter");
        libary.add("Eggs");
        libary.add("Milk");
        libary.add("Cheese");

        System.out.println(libary);

        for (int i = 0; i<libary.size(); i++){
            System.out.println("- " + libary.get(i));
        }
    }
}