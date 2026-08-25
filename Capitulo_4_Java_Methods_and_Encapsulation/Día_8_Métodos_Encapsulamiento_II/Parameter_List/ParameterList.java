package Designing_Methods.Parameter_List;

public class ParameterList {
    /*
    Parameter List: Reglas de las listas de parametros de un metodo:
    - Parentesis obligatorios.
    - Si hay multiples parametros son separados por comas.
    - Los parentesis definen el final del metodo y el inicio de los parametros
    - pueden estar vacios.
    */

    // public void walk1  - No se puede saber si es un metodo o una variable.

    public void walk1(){ // Valido
        // Metodo sin parametros.
    }

    /*public void walk{ // DOES NOT COMPILE
        // Metodo invalido, falta parentesis.
    }*/

    public void walk2(int a){ // Valido
        // Metodo con un parametro.
    }

    /*public void walk3(int b; int c){ // DOES NOT COMPILE
        // Metodo invalido, parametros separados por ;
    }*/

    public void walk4(int d, int e){ // Valido
        // Parametros separados por comas.
    }

    public static void main(String[] args) {
        System.out.println("Parameter List: Reglas de las listas de parametros de un metodo");
        ParameterList pr = new ParameterList();
       pr.walk1();
       pr.walk2(0);
       pr.walk4(0, 0); 

    }


}
