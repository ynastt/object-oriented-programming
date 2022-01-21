/*18 Таблица, отображающая имена животных в зоопарке в
названия их видов и номера клеток, где они
содержатся, с операциями:
1. получение потока номеров непустых клеток,  в которых все животные принадлежат одному виду; stream
2. поиск животного указанного вида, для которого в зоопарке не имеется товарища того же вида. optional
Проверить работу первой операции нужно путём группировки номеров клеток по первой цифре номера.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Abby", "tiger", 1));
        animals.add(new Animal("Bob", "tiger", 2));
        animals.add(new Animal("Charlie", "lion", 3));
        animals.add(new Animal("Max", "lion", 30));
        animals.add(new Animal("Daniel", "lion", 4));
        animals.add(new Animal("Rrrr", "lion", 5));
        animals.add(new Animal("Eric", "tiger", 25));
        animals.add(new Animal("Melman", "giraffe", 7));

        Zoo zoo = new Zoo(animals);

        // проверка 1 операции - получение потока номеров клеток с одинковыми животными
        //+ группирующий коллектор, чтобы отсортировать номера клеток в потоке по их первым цифрам
        System.out.println("tigers live here:");
        Stream<Integer> str = zoo.getStreamSameAnimalsInCage("tiger");
        //str.forEach(System.out::println); //<- обычный вывод номеров клеток
        Map<Object, List<Integer>> lst = str.collect(Collectors.groupingBy(Integer -> String.valueOf(Integer).charAt(0)));
        System.out.println(lst);

        // проверка 2 операции - поиск животного указанного вида,
        // для которого в зоопарке не имеется товарища того же вида
        System.out.println("Lonely one is: ");
        Optional<Animal> i = Optional.ofNullable(zoo.showLonelyAnimal("giraffe"));
        //если проверить lion или tiger, то ничего не выведет, тк таких животных несколько, а не один
        //Optional<Animal> i = Optional.ofNullable(zoo.showLonelyAnimal("lion"));
        i.ifPresent (v -> System.out.println(v.getName()));
        System.out.println();
    }
}
