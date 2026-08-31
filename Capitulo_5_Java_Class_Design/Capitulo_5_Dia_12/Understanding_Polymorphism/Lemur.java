package Capitulo_5_Dia_12.Understanding_Polymorphism;

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
      return false;
   }

   /*
   Estamos implementando la interface HasTial y por lo tanto debemos tener el metodo isTailStriped()
   el cual devuelve un valor booleano false.
   */

   public int age = 10;
   // Declaramos un atributo de tipo int llamado age y le asignamos el valor de 10.

   public static void main(String[] args) {
    
        Lemur lemur = new Lemur();
        // Creamos un objeto de tipo Lemur llamado lemur.
        System.out.println(lemur.age);
        // El cual va imprimir el valor de su atributo age que es 10.
        // Como es referencia lemur es de tipo Lemur, puede ver la variable age.

        /*
        Se crea un objeto Lemur el cual su referencia tiene acceso a todo: Los metodos
        de Lemur, los heredados x Primate y los implementados por HasTail.
        */

        HasTail hasTail = lemur;
        // Creamos una referencia de tipo HasTail llamada hasTail y le asignamos el objeto lemur.
        System.out.println(hasTail.isTailStriped());
        // La referencia es HasTail, pero se llama al metodo isTailStriped implementado en Lemur por lo cual
        // imprime false. No puede ver el atributo age porque es de tipo HasTail y no tiene acceso

        /*
        Polimorfismo, el mismo Objeto Lemur ahora es referencia de HasTail. No creamos un nuevo
        objeto - es el mismo Lemur solo que ahora es visto como un HasTail. Asi que puede ver
        sus metodos. No necesita hacer cast explicito. Porque al implementarlo hace una 
        conversion hacia un tipo superior (interface).
        */

        Primate primate = lemur;
        // Creamos una referencia de tipo Primate llamada primate y le asignamos el objeto lemur.
        System.out.println(primate.hasHair());

        /*
        Mismo objeto Lemur pero ahora visto en Primate. Sin cast explicito pq Lemur extends Primate.
        Asi que esta usando el metodo hasHair() heredado de Primate que devuelve true.
        */

        // Cuando no compila?
        /*HasTail hasTail = lemur;
        System.out.println(hasTail.age); // DOES NOT COMPILE

        Primate primate = lemur;
        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

        // System.out.println(hasTail.age); // DOES NOT COMPILE
        La referencia hasTail es de tipo HasTail y esa interface no define ninguna variable age,
        aunque tenga lemur que si tiene age, la referencia no puede ver el atributo age. Por eso no compila.

        // System.out.println(primate.isTailStriped()); // NO COMPILA
        Igualmente primate es de tipo Primate y no tiene definido ningun metodo isTailStriped(), ese
        metodo es definido por HasTail por lo cual primate no implementa ni reconoce.

        */
   }
}
