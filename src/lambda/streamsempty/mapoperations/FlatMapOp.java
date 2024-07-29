package lambda.streamsempty.mapoperations;

import lambda.streamsempty.helperclasses.Book;


import java.util.*;
import java.util.stream.Collectors;

public class FlatMapOp {

    public static void main(String[] args) {
        //1. returneaza o lista formata din toate caracterele din lista de liste
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a","b","c"));
        list.add(Arrays.asList("d","e","f"));
        list.add(Arrays.asList("g","h","i"));
        list.add(Arrays.asList("j","k","l"));

        List<String> flat = list.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(flat);






        //2. returneaza o lista cu toti autorii care incep cu o anumita litera, din lista de carti
        List<Book> javaBooks = List.of(
                new Book("Java EE 7 Essentials", List.of("Arun Gupta")),
                new Book("Algorithms",  List.of("Robert Sedgewick", "Kevin Wayne", "Robert Martin")),
                new Book("Clean code", List.of("Robert Martin"))
        );

        System.out.println(findAuthorsThatStartWith(javaBooks,"R"));
    }

    public static Set<String> findAuthorsThatStartWith (List<Book> books, String letter){
        return books.stream()
                .flatMap(book -> book.getAuthors().stream())
                .filter(author -> author.startsWith(letter))
                .collect(Collectors.toSet());
    }

    public static Set<String> findAuthorsThatStartWith2 (List<Book> books, String letter){
        Set<String> result = new HashSet<>();
        for (Book book: books){
            for (String author: book.getAuthors()){
                if (author.startsWith(letter)){
                    result.add(author);
                }
            }
        }
        return result;
    }
}
