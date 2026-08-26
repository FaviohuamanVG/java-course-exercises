package Capitulo_5_Dia_12.Static_Interface_Methods;

public interface Hop {
    /*
    Las interfaces tambien pueden tener metodos static, que funcionan como un metodo de clase
    normal, con una leve diferencia, que no se puede heredar en las clases que se implementen
    las interfaces. Evitandonos los problemas de ambiguedad.
    */

    // static se comporta como un metodo de clase normal, no se hereda, no se puede sobreescribir,
    //  no se puede llamar con super.
    // Diferencia es que si una clase TalNombre implementa interface Hop que tiene un metodo static,
    // TalNombre NO puede heredar ese metodo.

    // Paso 1. Declarar un metodo static en la interface Hop
    static int getJumpHeight() {
      return 8;
   }
   // Devuelve un retorno de tipo int con valor 8.
}
