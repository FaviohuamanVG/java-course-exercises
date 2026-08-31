package Capitulo_5_Dia_12.Default_Interface_Methods;

public interface SharkFamily extends HasFins{
    public default int getNumberOfFins(){
        return 8;
    }
    /*
    Es un metodo marcado como default, que tiene un cuerpo y al ser heredado de la interfaz HasFins, 
    puede ser sobreescrito y no esta obligado a hacerlo. Cambiando el valor de 6 a 8.
    */

    public double getLongestFinLength();
    /*
    Redeclaracion como abstract, quitamos el default y no tiene cuerpo, forzando a que cualquier clase
    que implemente SharkFamily deba dar su propia validacion. Compila
    */

    /*
    public boolean doFinsHaveScales() {
      return false;
    }

   
   NO COMPILA. Tiene cuerpo pero no tiene la palabra default en el metodo. Una interface con cuerpo
   debe tener obligatoriamente la palabra default, de lo contrario esta no COMPILARA.   
   */

    public static void main(String[] args) {
        System.out.println("Default Interface Methods");
        System.out.println("Una interfaz puede tener metodos con cuerpo llamados metodos default, rompiendo la idea de que un metodo de interfaz es abstracto.");
    }

}
