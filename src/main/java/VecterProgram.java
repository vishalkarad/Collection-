import java.util.Iterator;
import java.util.Vector;

public class VecterProgram {

    public static void main(String[] args) {
        Vector<String> teacher = new Vector<>();
        Vector<String> student = new Vector<>();
        student.add("shubham");
        student.add("vishal");
        student.add("sonal");
        student.add("nikhil");
        student.add("suraj");

        // Add and Remove elements in list
        student.add(2, "rohan");
        student.remove(5);
        System.out.println("Vector: " + student);

        // Using addAll()
        teacher.add("jadhav.Sir");
        teacher.add("bhosle.Sir");
        teacher.add("pathan.Sir");
        teacher.addAll(student);

        // Using iterator to print elements in teacher list
        Iterator iterator = teacher.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        // Using Stream to print elements
        System.out.println("\nusing stream");
        teacher.stream().forEach(elements -> System.out.print(elements + ", "));

        // contains
        teacher.stream().forEach(element -> {
            if (element.contains("bhosle.sir")) {
                teacher.remove(element);
            }
        });
    }
}
