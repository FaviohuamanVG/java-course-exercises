package Overloading_Methods.Primitives;

public class Plane {
    /*  
    La coincidencia más especifica tambien se aplican a los tipos primitivos de distintos tamaños.
    Jerarquia de Tamaños: 
    byte < short < int < long < float < double
    Cuando se hace la sobrecarga con distintos tipos primitive, Java busca la que
    coincida exactamente con ese tipo.
    Puedes pasar int a long pq long lo soporta, pero no puedes pasar long a int sin hacer un cast
    pq sino int no lo soporta.
    */

    public void fly(int i) { // COMPILE
        System.out.print("int ");
    } // metodo que recibe un primitive int

    public void fly(long l) { // COMPILE
        System.out.print("long ");
    } // metodo que recibe un primitive long

    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123); // COMPILE 
        p.fly(123L);
    }
}
