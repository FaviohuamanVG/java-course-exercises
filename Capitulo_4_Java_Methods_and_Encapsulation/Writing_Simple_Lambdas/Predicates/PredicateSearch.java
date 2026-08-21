package Writing_Simple_Lambdas.Predicates;

import java.util.*;
import java.util.function.*;

import Writing_Simple_Lambdas.Lambda_Example.Animal;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));

        print(animals, a -> a.canHop());
        System.out.println("Predicates: ");
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
