package Capitulo_5_Dia_12.Understanding_Polymorphism;

public class Primate {

    /*
    Polimorfismo, significa que un mismo objeto puede ser visto o accedido en distintos tipos de 
    referencia (su propia clase, superclase o una interface).

    Al crear un objeto se puede diferenciar de varias formas:
    El tipo exacto de Objeto: Lemur lemur = new Lemur();
    Con una superclase: Primate primate = lemur;
    O con una interface: HasTail hasTail = lemur;
    */

    // Cuando se reasigna una referencia de tipo superior (superclase o interface) no es necesario utilizar
    // cast explicito, Java lo hace autom. "upcasting" que siempre es seguro.

    public boolean hasHair() {
      return true;
   }

   /*
   Tenemos un metodo hasHair() que devuelve un valor booleano true.
   */
}
