package Designing_Methods.Optional_Specifiers;

public class Optional {
    /*  
    Especificadores Opcionales: Que pueden combinarse varios a
    la vez y en cualquier orden.
    */

    // static: metodo de clase.
    // abstract: metodo sin cuerpo.
    // final: no puede ser sobrescrito por una subclase.

    // Pueden usar varios especificadores juntos (static final)
    // el orden entre ellos no importa.

    // Sin especificador Opcional. Valido porque es OPCIONAL.
    public void method1(){
        System.out.println("Sin especificadores");
    }

    // Tiene el especificador final.
    public final void method2(){
        System.out.println("Especificador final");
    }

    // Tiene static y final como Especificadores. No importa el ORDEN.
    public static final void method3(){
        System.out.println("Especificadores static y final");
    }

    // Tiene final y static. Estan inversos pero COMPILA.
    public final static void method4(){
        System.out.println("Especificadores final y static");
    } // Como el orden entre especificadores no importa.

    /*
    // Especificador no existente. NO COMPILA
    public modifier void walk5(){
        System.out.println("ERROR: No se puede usar un especificador que no existe");
    }
    */

    /*
    // Especificador en la posición incorrecta. NO COMPILA
    public void final walk6(){
        System.out.println("Error: No se puede usar un especificador en la posicion incorrecta");
    } // Se colocar final despues del tipo de retorno. No antes.
    */

    // Especificador antes del Modificador. Caso raro COMPILA
    final public void walk7(){
        System.out.println("Especificador final antes del modificador");
    }

    public static void main(String[] args) {
        Optional optional = new Optional();
        optional.method1();
        optional.method2();
        Optional.method3();
        Optional.method4();
        optional.walk7();
    }

}
