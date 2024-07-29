package lambda;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //(x,y) -> x%y == 0 ;
        Function<String,Integer> lengthCalculator = x -> x.length();
        System.out.println(lengthCalculator.apply("sdfhgdfshg"));

        Function<String, String> subtringExtractor1 = x -> x.substring(1);
        System.out.println(subtringExtractor1.apply("tralalal"));

        Function<String, String> subtringExtractor2 = x -> x.substring(1,3);
        System.out.println(subtringExtractor2.apply("tralalal"));

        //DigiFM digiFMClassic = new DigiFM();
        //digiFMClassic.play("la multi ani");

        RadioBroadcast digiFM = message -> System.out.println("esti la digifm " + message );
        digiFM.play("la multi ani");
        RadioBroadcast kissFM = message -> System.out.println("esti la kissfm" + message);
        kissFM.play("ai castigat un milion de euro");
    }
}
