package Abstract_Classes.Creating_a_Concrete_Class;

public class Bird extends Animal { // DOES NOT COMPILE

    // Bird no se declara como abstract, pero tampoco escribe el método getName()
    /*
 // Debe aplicar esto para compilar
    public String getName() {
        return "bird";
    }
    */

        public String getName() {
        return "bird";
    }
}
