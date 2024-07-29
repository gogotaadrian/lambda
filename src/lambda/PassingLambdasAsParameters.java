package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class PassingLambdasAsParameters {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John",23));
        persons.add(new Person("Carl",23));
        persons.add(new Person("Bsffg",23));
        persons.add(new Person("Zfgfdg",23));


        //Collections.sort(persons, new AgeComparator());

        wish(() -> System.out.println("cealues"));

        Collections.sort(persons, (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        persons.forEach(p -> System.out.println(p));

        persons.removeIf(p -> p.getAge()<18);


        IndianGreeting indianGreeting = new IndianGreeting();
        wish (indianGreeting);
        wish( new EnglishGreeting());
    }

    public static void wish(Greeting greeting){
        greeting.sayHello();
        System.out.println("sa ne auzim de bine");
    }
}
