import java.util.List;
import java.util.ArrayList;

public class ListExemple {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Mary");
    names.add("Alice");

    // for (String name : names) {
    // System.out.println(name);
    // }

    names.forEach(name -> System.out.println("Nome cadastrado: " + name));
  }
}
