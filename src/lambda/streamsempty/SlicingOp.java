package lambda.streamsempty;

import java.util.ArrayList;
import java.util.List;

public class SlicingOp {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("India");
        countries.add("UK");
        countries.add("China");
        //1. printeaza tarile din lista, fara sa se repete
        //2. printeaza 3 tari din lista, fara sa se repete
    }
}
