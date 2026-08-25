package Encapsulating_Data;
    /*  
    Entender el encapsulamiento de datos y la importancia de la encapsulación de datos.
    Cuando se declara un campo sin modificador de acceso o como public, cualquier clase
    dentro de ese mismo paquete accede a public. La clase pierde e control sobre su
    propio estado.
    */
public class Swan {
    // int numberEggs = -1; // No es bueno, ya que cualquiera accede a este campo.

    // Solucion:
    private int numberEggs; // private
    // Ninguna otra clase puede acceder a este campo, solo la clase Swan.
    // Es casi imposible que otra clase haga esto: swam.numberEggs = -1;
    // El compilador lo rechaza

    public int getNumberEggs() { // getter
        return numberEggs; // Expone la lectura del valor
    }

    public void setNumberEggs(int numberEggs) { // practica comun y valida
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
    }

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.setNumberEggs(5);
        System.out.println(swan.getNumberEggs());
    }

}
