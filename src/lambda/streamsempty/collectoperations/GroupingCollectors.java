package lambda.streamsempty.collectoperations;


import lambda.streamsempty.helperclasses.Account;
import lambda.streamsempty.helperclasses.Employee;
import lambda.streamsempty.helperclasses.Item;
import lambda.streamsempty.helperclasses.Status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingCollectors {
    public static void main(String[] args) {

        List<Account> accounts = List.of(
                new Account(3333, "530012", Status.REMOVED),
                new Account(15000, "771843", Status.ACTIVE),
                new Account(0, "681891", Status.BLOCKED),
                new Account(2000, "681891", Status.ACTIVE)
        );

        //1. grupeaza conturile din lista dupa status (adica genereaza o mapa in care cheia este statusul, iar valoarea o lista cu toate conturile care au acel status)
        Map<Status, List<Account>> accountsByStatus = accounts.stream()
                .collect(Collectors.groupingBy(account -> account.getStatus()));
        System.out.println(accountsByStatus);

        //2. grupeaza angajatii din lista dupa tara (adica genereaza o mapa in care cheia este tara, iar valoarea o lista cu toti angajatii din acea tara
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex" , 23, 23000, "USA"));
        employeeList.add(new Employee("Ben" , 63, 25000, "China"));
        employeeList.add(new Employee("Dave" , 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi" , 43, 67000, "USA"));
        employeeList.add(new Employee("Ryan" , 53, 54000, "China"));


        Map<String, List<Employee>> employeesByCountry = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getCountry()));



        //3. genereaza o mapa in care cheia este tara, iar valoarea este suma salariilor angajatilor din acea tara)
        Map<String, Integer> totalSalariesByCountry = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getCountry(), Collectors.summingInt(employee -> employee.getSalary())));

        //4. genereaza o mapa in care cheia este tara, iar valoarea este numarul de angajati din acea tara)
        Map<String, Long> numberOfEmployeesByCountry = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getCountry(), Collectors.counting()));


        List<Item> items = Arrays.asList(
                new Item("apple", 10,9.99),
                new Item("banana", 20, 19.99),
                new Item("orang", 10, 29.99),
                new Item("watermelon", 10, 29.99),
                new Item("papaya", 20, 9.99),
                new Item("apple", 10, 9.99),
                new Item("banana", 10, 19.99),
                new Item("apple", 20, 9.99)
        );

        //5. genereaza o mapa in care cheia este numele produsului, iar valoarea este numarul de produse cu acel nume care se afla in lista
        Map<String, Long>  productsByName = items.stream()
                .collect(Collectors.groupingBy(item -> item.getName(),Collectors.counting()));

        //6. genereaza o mapa in care cheia este numele produsului, iar valoarea cantitatea totala a produselor cu acel nume)

        //7. genereaza o mapa in care cheia este pretul produsului, iar valoarea este lista de produse cu acel pret
        //adica grupeaza produsele dupa pret

    }

}

