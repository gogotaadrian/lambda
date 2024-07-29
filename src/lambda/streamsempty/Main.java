package lambda.streamsempty;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //1 ce este un stream
        //afiseaza cate numere din lista sunt mai mari decat 5
        //versiunea clasica
        List<Integer> numbers = List.of(1,4,7,6,2,9,7,8);
        int count = 0;
        for(Integer number: numbers){
            if (number> 5){
                count++;
            }
        }
        System.out.println(count);

        long countNumbers = numbers.stream()
                .filter(number -> number>5)
                .count();


        List<String> companies = List.of("Google", "Amazon", "Samsung", "GOOGLE", "amazon", "Oracle");

        companies.stream()
                .map(company -> company.toUpperCase())
                .distinct()
                .forEach(company -> System.out.println(company));



        //2. filter

        //3. filter cu collect

        //4. map

        //5. flatmap

        //6. reduce

        //7. collect

        //8. grouping and aggregatin collectors

        //9. matching

        //10. finding



    }
}
