import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Peter", "Black", new Address("Minsk", "Backer Street", 123)),
                new Person("Jane", "White", new Address("Minsk", "Independence", 1)),
                new Person("Kate", "Bow", new Address("Moskow", "New Street", 20)),
                new Person(null, "WithoutName", new Address("City1", "Street1", 1)),
                new Person("WithoutLastName", null, new Address("City2", "Street2", 2)),
                new Person("WIthoutAddress", "WithoutAddress", null));


        System.out.println("Task");
        personList.stream()
                .filter((Person person) -> (person.getFirstName() != null || person.getLastName() != null || person.getAddress() != null))
                .sorted(Comparator.comparing((Person person) -> person.getAddress().getHouse()))
                .map(Person::toString)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}