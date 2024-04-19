import java.util.List;
import java.util.ArrayList;

public class ListExemple {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Mary");
    names.add("Alice");

    System.out.println(names.get(1)); // Utilizando o método get para pegar o valor do índice 1.
    System.out.println(names.size()); // Utilizando o método size para pegar o tamanho da lista.

    for (String name : names) {
      System.out.println(name);
    }

    names.forEach(name -> System.out.println("Nome cadastrado: " + name));
    // forma que foi introduzida a partir do java 8 para percorrer uma lista.

    names.forEach(System.out::println); // Utilizando o método de referência para imprimir os valores da lista.
  }
}
