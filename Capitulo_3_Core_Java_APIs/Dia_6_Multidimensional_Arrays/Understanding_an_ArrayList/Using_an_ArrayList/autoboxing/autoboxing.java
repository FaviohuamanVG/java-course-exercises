package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.autoboxing;

import java.util.List;
import java.util.ArrayList;

public class autoboxing {
    /*
    El autoboxing es el empaquetado automatico. Le brindas un dato simple a una lista y Java lo
    envuelve automaticamente en un Objeto(Double) para que este pueda ser almacenado en la lista.
    */
   public static void main(String[] args) {
    List<Double> weights = new ArrayList<>();
    weights.add(50.5);  // [50.5]
    weights.add(new Double(60));  // [50.5, 60.0]
    weights.remove(50.5);  // [60.0]
    double first = weights.get(0); // 60.0
    System.out.println(first);

    // Unboxing es el proceso inverso, cuando sacas el objeto de la lista y se le asigna
    // a una variable simple. Java te entrega el dato simple.

        // Posición (Índice) y Valor con Integer
    List<Integer> number = new ArrayList<>();
    number.add(1); // [1]
    number.add(2); // [1, 2]
    number.remove(1);
    System.out.println(number); // 1

    // Unboxing de un null
    List<Integer> weights2 = new ArrayList<>();
    weights2.add(null);
    int h = weights2.get(0); // !Error! - NullPointerException

   }
}
