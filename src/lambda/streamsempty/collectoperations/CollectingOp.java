package lambda.streamsempty.collectoperations;


import lambda.streamsempty.helperclasses.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CollectingOp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex" , 23, 23000, "USA"));
        employeeList.add(new Employee("Ben" , 63, 25000, "India"));
        employeeList.add(new Employee("Dave" , 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi" , 43, 67000, "China"));
        employeeList.add(new Employee("Ryan" , 53, 54000, "Libya"));

        //1. returneaza o lista cu numele tututor angajatilor din lista de angajati


        //2. returneaza un set cu tarile tututor angajatilor din lista de angajati


        //3. returneaza o mapa in care cheia este fiecare nume de angajat din lista, iar valoarea este tara angajatului
        Map<String, String> map1 = employeeList.stream()
                .collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getCountry()));

        //4. returneaza o lista cu numerele de cont ale tuturor conturilor din lista de conturi


        //5. returneaza suma soldurilor tuturor conturilor din lista de conturi


        //6. returneaza o lista cu soldurile conturilor din lista de conturi

    }

}

