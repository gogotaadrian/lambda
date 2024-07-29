package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class PersonEligibleForVote {

    public static void main(String[] args) {
        Person person = new Person("Costel",23);
        verifyPerson(person, p -> p.getAge()>18);
        verifyPerson(person, p -> p.getName().startsWith("A"));

    }

    public static boolean verifyPerson (Person person, Predicate<Person> criteria){
        return criteria.test(person);
    }
}
