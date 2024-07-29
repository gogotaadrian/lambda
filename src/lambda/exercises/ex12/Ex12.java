package lambda.exercises.ex12;

import java.util.List;

public class Ex12 {

    public static void main(String[] args) {
        //12. Gestiunea angajatilor
        //Un angajat este caracterizat de nume si salariu.
        // Un departament este caracterizat de nume, cod, si o lista de angajati.
        // Codul este un String
        //
        //Avand o lista de departamente intr-un main, care are fiecare o lista de angajati,
        // scrie o metoda care primeste lista de departamente si un salariu minim.
        //
        //Metoda va returna cati angajati din toate departamentele au salariul mai mare
        // decat salariul minim primit ca parametru.
    }

    public static Long getNumberOfEmployeesWithSalaryGreaterThan (List<Department> departments, Integer minSalary){
        return departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary()>minSalary)
                .count();
    }
}
