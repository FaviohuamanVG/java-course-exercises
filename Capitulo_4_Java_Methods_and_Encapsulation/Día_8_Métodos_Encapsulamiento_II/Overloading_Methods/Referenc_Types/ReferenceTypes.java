package Overloading_Methods.Referenc_Types;

public class ReferenceTypes {
    /*  
    La regla de Java eligiendo la opcion mas especifica. Aplica tambien para tipos de referencia.
    String vs Object. No solo primitives y wrappers.
    Como String hereda de Object, un String tambien es un Object.
    Si no hay coincidencia con un primitive, intenta autoboxing. 
    */

    public void fly(String o) {
        System.out.println("String");
    }

    public void fly2(Object o){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        ReferenceTypes rf = new ReferenceTypes();
        rf.fly("test");
        rf.fly2(56); // Autoboxing --> int --> Integer --> Object
    }
}
