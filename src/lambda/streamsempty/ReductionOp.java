package lambda.streamsempty;

import lambda.streamsempty.helperclasses.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReductionOp {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(20, 40, -60, 5);
        //1. printeaza maximul din lista de numere
        //2. printeaza suma numerelor din lista


        Optional<Integer> optionalSum = transactions.stream()
                .reduce((sum,transaction)->sum+transaction);
        System.out.println(optionalSum.get());




        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex" , 23, 23000, "USA"));
        employeeList.add(new Employee("Ben" , 63, 25000, "India"));
        employeeList.add(new Employee("Dave" , 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi" , 43, 67000, "China"));
        employeeList.add(new Employee("Ryan" , 53, 54000, "India"));
        //3. printeaza suma salariilor angajatilor din lista

        System.out.println(computeTotalSalaryExpense(employeeList, "India"));
    }

    public static Integer computeTotalSalaryExpense (List<Employee> employeeList, String country){
        Optional<Integer> optionalSum =  employeeList.stream()
                .filter(employee -> employee.getCountry().equals(country))
                .map(employee -> employee.getSalary())
                .reduce((sum, salary)->sum+salary);

        return optionalSum.orElse(0);
    }
}
