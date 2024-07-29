package lambda.streamsempty;

import lambda.streamsempty.helperclasses.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOp {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(23);
        list1.add(45);
        list1.add(6);
        //1. printeaza numerele din lista care sunt mai mari decat 10
        //Stream<Integer> first = list1.stream();
        //Stream<Integer> second = first.filter(number -> number > 10);
        //second.forEach(number -> System.out.println(number));

        list1.stream()
                .filter(number->number>10)
                .forEach(number-> System.out.println(number));

        //lista initiala ramane la fel
        System.out.println(list1);




        List<String> programmingLanguages = Arrays.asList("Java", "", "scala", "Kotlin", "", "clojure");
        //2. printeaza cate string-uri din lista care incep cu litera mare si in acelasi timp care nu sunt goale
        long count = programmingLanguages.stream()
                .filter(language -> Character.isUpperCase(language.charAt(0)) && !language.isEmpty())
                .count();


        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "USA"));
        list.add(new Person("Joe", 18, "USA"));
        list.add(new Person("Ryan", 54, "USA"));
        list.add(new Person("Iyan", 5, "USA"));
        list.add(new Person("Ray", 63, "USA"));
        //3. printeaza care sunt persoanele active (cu varsta mai mare decat 18 si mai mica decat 60 de ani)

        List<Person> activePersons = list.stream()
                .filter(person -> person.getAge()>18 && person.getAge()<60)
                .collect(Collectors.toList());
    }
}


