package Introducing_Class_Inheritance.Overriding_a_Method;

public class Wolf extends Canine {
    public double getAverageWeight(){
        return super.getAverageWeight() + 20;
    }

    /*  
    // Bucle infinito sin utilizar super:
        public double getAverageWeight(){
        return getAverageWeight() + 20;
        el metodo se llame a si mismo infinitamente y cause un StackOverflowError
    }
    */

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight()); // Sobreescribe el metodo padre. Retorna 
        // double, usa super.getAverageWeight para obtener el 50 y luego sumarle 20, retornando 70.
    }
}

