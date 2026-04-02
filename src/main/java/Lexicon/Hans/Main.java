package Lexicon.Hans;

import java.util.ArrayList;
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

        //Core Task 2 write rules for active, adult and lives in Stockholm.
        PersonRule isActive = (person) -> person.isActive();
        PersonRule isAdult = (person) -> person.getAge() >= 18;
        PersonRule livesInStockholm = (person) -> person.getCity().equals("Stockholm");

        //Core Task 4 write actions to print a name and send email.
        PersonAction printName = (Person person) -> System.out.println(person.getName());
        PersonAction printEmail = (Person person) -> System.out.println("Send email to " + person.getName() + ".");


    }
        //Core Task 3 write a filterPeople method that uses PersonRule.
        public static List<Person> filterPeople (List<Person> personList, PersonRule filter) {
            List<Person> filteredList = new ArrayList<>();
            for (Person person : personList) {
                if (filter.rule(person)) {
                    filteredList.add(person);
                }
            }
            return filteredList;
    }
}
