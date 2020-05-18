import java.util.*;

public class ArrayListPrograms {

    public static void main(String args[]) {
        ArrayList<String> alist = new ArrayList<String>();
        ArrayList<String> country = new ArrayList<String>();

        // Add element in list
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        //displaying elements
        System.out.println(alist);

        // Check list is empty or not
        System.out.println(country.isEmpty());

        // Ensure capacity
        country.ensureCapacity(10);

        // Add element in country
        country.add("America");
        country.add("India");
        country.add("Pakistan");
        country.add("England");
        country.add("Sri lanka");

        // Sort list in ascending order
        Collections.sort(alist);
        System.out.println("ascending order " + alist);

        // Sort list in descending order
        Collections.sort(alist, Collections.reverseOrder());
        System.out.println("descending order " + alist);

        // Check contains in list
        Optional<String> find = alist.stream().filter(element -> element.contains("Steve")).findFirst();
        System.out.println("Check contains in list " + find);

        // Remove if
        System.out.println("List of country " + country);
        country.removeIf(element -> element.contains("Pakistan"));
        System.out.println("Delete Pakistan " + country);

    }
}
