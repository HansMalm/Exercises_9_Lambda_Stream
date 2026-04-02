package Lexicon.Hans;

import java.util.List;

public class Main {
    static void main() {

        //Sample Data
        List<Person> people = List.of(
                new Person("Amina", 22, "Stockholm", true),
                new Person("Erik", 17, "Uppsala", true),
                new Person("Noah", 34, "Stockholm", false),
                new Person("Sara", 29, "Gothenburg", true),
                new Person("Lina", 41, "Malmö", false),
                new Person("Omar", 19, "Stockholm", true)
        );

        PersonRule isActive = (person) -> person.isActive();
        PersonRule isAdult = (person) -> person.getAge() >= 18;
        PersonRule livesInStockholm = (person) -> person.getCity().equals("Stockholm");

    }
}
