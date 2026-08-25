public class ReturnType {
    /*
    Return Type: Cada metodo tiene un tipo de retorno.
    - Todo metodo declara un tipo de retorno y este no puede
    - omitirse. Si no retorna nada se utiliza void.
    - Si no se declara como void debe tener un valor
    - de retorno asignado a un valor de variable.

    Declaracion de un metodo:
    modificador tipoRetorno nameMethod (Paramether) {
        // cuerpo
    }

    */

    public void walk1(){
        // no retorna nada.
    }

    public void walk2(){
        return; // return sin valor.
    }

    public String walk3(){
        return "";
    }

    /*public String walk4(){
        // tiene que asignarse un 
        // valor de retorno
    }*/

    /*public walk5(){
        // sin void ni retorno
        // asignado al metodo
    }*/

    String walk6(int a){
        if(a == 4);
        return "";
    }

    // Segundo Bloque:
    int integer(){
        return 9;
    }

    /*int long(){
        return 9L; // DOES NOT COMPILE
    }*/

    // Version Extendidad (Variable local intermedia):
    int integerExpanded(){
        int x = 4;
        return x;
    }

    /*int longExpanded(){
        int temp = 9L;
        return temp; // DOES NOT COMPILE
    }*/


    public static void main(String[] args) {
        System.out.println("Return Type: No retornan Valores");
        ReturnType rt = new ReturnType();
        rt.walk1();
        rt.walk2();
        rt.walk3();
        rt.walk6(4);
        rt.integerExpanded();
    }

}
