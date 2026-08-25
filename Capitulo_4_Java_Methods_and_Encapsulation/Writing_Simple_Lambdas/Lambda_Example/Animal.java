package Writing_Simple_Lambdas.Lambda_Example;
    /*
    Paradigma Funcional de Java 8, mediante las Lambdas Expressions.
    - Un bloque de codigo sin nombre que pasa como si fuera una variable.
    - Parecido a un metodo anonimo.
    - Definen un interfaz que declare el metodo.
    - Crea una clase completa que implementa el metodo de la interfaz.
    */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }

    // Interfaz funcional, que define un metodo el cual recibe es Animal y luego devuelve un boolean.
    public interface CheckTrait {
        boolean test(Animal a);
    }

    // Sin Lambda:
    public class CheckIfHopper implements CheckTrait {
        public boolean test(Animal a){
            return a.canHop();
        }
    }

}
