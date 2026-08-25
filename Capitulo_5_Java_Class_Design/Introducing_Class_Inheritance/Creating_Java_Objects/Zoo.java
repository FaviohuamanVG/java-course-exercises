package Introducing_Class_Inheritance.Creating_Java_Objects;
    /*
    Toda clase sin excepciones hereda java.lang.Object, esto se aplica internamente
    cuando no especificamos una clase padre.
    */
public class Zoo {
    // internamente el compilador lo traduce a:
    // public class Zoo extends java.lang.Object
    // public class Zoo extends Animal, el compilador ya no lo aplica internamente
    // ya existe un extends explicito.

    public static void main(String[] args) {
        System.out.println("Creating Java Objects");
        System.out.println("Toda clase sin excepcion hereda Object, directa o indirectamente.");
    }
}
